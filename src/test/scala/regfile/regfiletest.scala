package regfile

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec



class regfiletest extends FreeSpec with ChiselScalatestTester{
    "Register Test" in {
        test(new RegFile){ dut =>

            dut.io.raddr1.poke(6.U)
            dut.io.raddr2.poke(8.U)

            dut.io.wen.poke(1.B)
            dut.io.waddr.poke(8.U)
            dut.io.wdata.poke(90.U)

          

            dut.io.rdata1.expect(0.U)
            dut.io.rdata2.expect(80.U)

            dut.clock.step(1)        
            dut.io.rdata2.expect(90.U)
            

        }

    }
}