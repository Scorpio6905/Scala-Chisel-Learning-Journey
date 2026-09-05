package regfile

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec


class Masktest extends FreeSpec with ChiselScalatestTester{
    "" in {
        test(new MaskedReadWriteSmem){ dut=>
            dut.io.enable.poke(1.B)
            dut.io.write.poke(1.B)
            dut.io.addr.poke(10.U)
            dut.io.mask(0).poke(1.B)
            dut.io.mask(1).poke(1.B)
            dut.io.mask(2).poke(0.B)
            dut.io.mask(3).poke(0.B)

            dut.io.dataIn(0).poke(1.U)
            dut.io.dataIn(1).poke(1.U)
            dut.io.dataIn(2).poke(1.U)
            dut.io.dataIn(3).poke(1.U)

            dut.clock.step()

            dut.io.dataOut(0).expect(1.U)
            dut.io.dataOut(1).expect(1.U)
            dut.io.dataOut(2).expect(0.U)
            dut.io.dataOut(3).expect(0.U)

        }
    }
}