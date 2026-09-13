package regfile

import chisel3._
import chisel3.util._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._


class PCtest extends FreeSpec with ChiselScalatestTester{
    "" in {
        test(new PC){ dut =>

            dut.io.PC_IN.poke(1000.U)
            dut.clock.step()

            dut.io.PC_OUT.expect(1000.U)
            dut.io.PC_NEXT.expect(1004.U)
            

        }
    }
}