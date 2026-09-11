import chisel3._
import chisel3.util._


class ControlDecode extends Module {
    val io = IO(new Bundle {

        val opcode = Input(UInt(7.W))

        val format = Output(UInt(4.W))
  })

    

}