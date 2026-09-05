package regfile

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import java.nio.charset.StandardCharsets
import java.nio.file.Files

class CodeMemtest extends FreeSpec with ChiselScalatestTester{
    "" in {
       
        test(new InstMem("src/test/resources/main.txt")) { dut =>
          

            dut.io.addr.poke(0.U)
            dut.io.inst.expect("h00000013".U)

            dut.io.addr.poke(4.U)
            dut.io.inst.expect("h00100093".U)

            dut.io.addr.poke(8.U)
            dut.io.inst.expect("h00200113".U)

            dut.io.addr.poke(12.U)
            dut.io.inst.expect("h00300193".U)
            
        }
    }
}