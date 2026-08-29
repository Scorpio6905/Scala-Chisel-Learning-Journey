package lab2

import chisel3._
import chisel3.util._


class EncoderIO extends Bundle {
    val in0 = Input(UInt(4.W))
    val in1 = Input(UInt(4.W))
    val in2 = Input(UInt(4.W))
    val in3 = Input(UInt(4.W))
    val sel = Input(UInt(4.W))
    val out = Output(UInt(2.W))
}
class Encoder4to2 extends Module {
    
    val io = IO(new EncoderIO)

    val out2bit = Mux1H(io.sel, Seq(io.in0, io.in1, io.in2, io.in3))
    io.out := out2bit(1, 0)
    
}

