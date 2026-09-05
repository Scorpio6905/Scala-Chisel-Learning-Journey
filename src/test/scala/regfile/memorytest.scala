package regfile

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec

class memorytest extends FreeSpec with ChiselScalatestTester{
    "" in {
        test(new Asynch_Mem) { dut =>
            dut.io.data_in(0).poke(2.U)
            dut.io.data_in(1).poke(4.U)
            dut.io.data_in(2).poke(8.U)
            dut.io.data_in(3).poke(16.U)

            dut.io.data_selector.poke(1.U)
            dut.io.wr_en.poke(1.B)
            dut.io.addr.poke(3.U)

            dut.clock.step()
            dut.io.data_out.expect(4.U)
        }
    }
}