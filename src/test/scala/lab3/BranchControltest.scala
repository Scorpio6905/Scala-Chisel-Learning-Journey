package lab3

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

import chiseltest.experimental.TestOptionBuilder._
import chiseltest.internal.VerilatorBackendAnnotation
import scala.util.Random
import ALUOP._

class BranchControltest extends FreeSpec with ChiselScalatestTester {
    "Branch Test" in { 
        test(new BranchControl){ dut =>
    // ALU operations

    val funct3 = Array("b000", "b001", "b100", "b101", "b110", "b111")

    for ( i <- 0 until 10) {
        val src_a = Random.nextLong() & 0xFFFFFFFFL
        val src_b = Random.nextLong() & 0xFFFFFFFFL
        val instr = Random.nextInt(6)
        val branchop = funct3(instr)
        
    // ALU functional implementation using Scala matchval 
        val result: Boolean = branchop match {
        case "b000" => src_a == src_b
        case "b001" => src_a != src_b
        case "b100" => src_a < src_b
        case "b101" => src_a >= src_b
        case "b110" => src_a < src_b
        case "b111" => src_a >= src_b
        case _ => false
    }
        val result1 = if (result) true.B else false.B


        dut.io.funct3.poke(branchop.U)
        dut.io.arg_x.poke(src_a.U)
        dut.io.arg_y.poke(src_b.U)
        dut.io.branch.poke(true.B)
        dut.clock.step(1)
        dut.io.br_taken.expect(result1)
}
      
}
}
}