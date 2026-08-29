package lab2

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._


class barrel_shifttest extends FreeSpec with ChiselScalatestTester {
  "dut test" in {
    test(new barrel_shift) { dut =>
 
     dut.io.in(0).poke(0.B)
     dut.io.in(1).poke(1.B)
     dut.io.in(2).poke(0.B)
     dut.io.in(3).poke(1.B)

     dut.io.sel(0).poke(0.B)
     dut.io.sel(1).poke(1.B)

     dut.io.shift_type.poke(0.B)

     dut.io.out(0).expect(1.B)
     dut.io.out(1).expect(0.B)
     dut.io.out(2).expect(1.B)
     dut.io.out(3).expect(0.B)
   

    }
  }
}