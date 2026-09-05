error id: file://<WORKSPACE>/src/test/scala/lab4/buggedAlutest.scala:`<error>`#`<error>`.
file://<WORKSPACE>/src/test/scala/lab4/buggedAlutest.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/dut/io.
	 -chisel3/tester/dut/io.
	 -chisel3/experimental/BundleLiterals.dut.io.
	 -chiseltest/experimental/TestOptionBuilder.dut.io.
	 -ALUOP.dut.io.
	 -dut/io.
	 -scala/Predef.dut.io.
offset: 1750
uri: file://<WORKSPACE>/src/test/scala/lab4/buggedAlutest.scala
text:
```scala
package lab4

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

import chiseltest.experimental.TestOptionBuilder._
import chiseltest.internal.VerilatorBackendAnnotation
import scala.util.Random
import ALUOP._

class buggedAlutest extends FreeSpec with ChiselScalatestTester {
    "ALU Test" in { 
        test(new buggedAlu).withAnnotations( Seq ( VerilatorBackendAnnotation ) ){ dut =>
    // ALU operations

    val array_op = Array ( ALU_ADD , ALU_SUB , ALU_AND , ALU_OR , ALU_XOR , ALU_SLT ,
    ALU_SLL , ALU_SLTU , ALU_SRL , ALU_SRA , ALU_COPY_A , ALU_COPY_B , ALU_XXX )

    for ( i <- 0 until 100) {
        val src_a = Random.nextLong() & 0xFFFFFFFFL
        val src_b = Random.nextLong() & 0xFFFFFFFFL
        val opr = Random.nextInt(12)
        val aluop = array_op(opr)
        
    // ALU functional implementation using Scala matchval 
        val result = aluop match {
        case ALU_ADD => src_a + src_b
        case ALU_SUB => src_a - src_b
        case ALU_AND => src_a & src_b
        case ALU_OR => src_a | src_b
        case ALU_XOR => src_a ^ src_b
        case ALU_SLT =>  if (src_a.toInt < src_b.toInt) 1 else 0
        case ALU_SLL => src_a << ( src_b & 0x1F )
        case ALU_SLTU => if (src_a < src_b) 1 else 0
        case ALU_SRL => src_a >>> ( src_b & 0x1F )
        case ALU_SRA => src_a.toInt >> ( src_b.toInt & 0x1F )
        case ALU_COPY_A => src_a
        case ALU_COPY_B => src_b
        /* case ALU_MUL => src_a * src_b
        case ALU_DIV => src_a / src_b */ 
        case _ => 0
}
        // val result1 : Long = //if ( result < 0)
        //((0xFFFFFFFFL) + result +1) & 0xFFFFFFFFL
        
         result & 0xFFFFFFFFL

        dut.i@@o.in_A.poke(src_a.U)
        dut.io.in_B.poke(src_b.U)
        dut.io.alu_Op.poke(aluop)
        dut.clock.step(1)
        dut.io.out.expect(result1.asUInt)
}
      
}
}
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 