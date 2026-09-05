package regfile

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec


class SyncMemorytest extends FreeSpec with ChiselScalatestTester{
    " " in {
      test(new Parameterized_Mem()) { dut =>
            dut.io.dataIn.poke(32.U)
            dut.io.addr.poke(5.U)
            
            dut.io.wr_enable.poke(1.B)

            dut.io.rd_enable.poke(1.B)
            
            dut.clock.step()

            dut.io.dataOut.expect(32.U)
      }
    }
}