package Gates

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

class counter_up_down_test extends FreeSpec with ChiselScalatestTester {
  "dut test" in {
    test(new counter_up_down(8)) { dut =>
   
    dut.clock.step(100)
    
    }
  } 
}
