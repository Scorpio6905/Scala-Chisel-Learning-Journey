package Gates

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._


class Eightbitfulladdertest extends FreeSpec with ChiselScalatestTester {
  "dut test" in {
    test(new Eightbitfulladder) { dut =>

   dut.io.a1.poke(0.B)
   dut.io.b1.poke(0.B)
   dut.io.a2.poke(0.B)
   dut.io.b2.poke(0.B)
   dut.io.a3.poke(0.B)
   dut.io.b3.poke(0.B)
   dut.io.a4.poke(0.B)
   dut.io.b4.poke(0.B)
   dut.io.a5.poke(0.B)
   dut.io.b5.poke(0.B)
   dut.io.a6.poke(0.B)
   dut.io.b6.poke(0.B)
   dut.io.a7.poke(0.B)
   dut.io.b7.poke(0.B)
   dut.io.a8.poke(0.B)
   dut.io.b8.poke(0.B)


   dut.io.sum1.expect(0.B)  
   dut.io.sum2.expect(0.B)  
   dut.io.sum3.expect(0.B)  
   dut.io.sum4.expect(0.B)  
   dut.io.sum5.expect(0.B)  
   dut.io.sum6.expect(0.B)  
   dut.io.sum7.expect(0.B)  
   dut.io.sum8.expect(0.B)

   dut.io.cout.expect(0.B)  

   dut.clock.step(1)
   
    }
  }
}