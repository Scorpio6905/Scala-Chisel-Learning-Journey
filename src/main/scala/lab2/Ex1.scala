package lab2
import chisel3._
import chisel3.util._
// Mux IO interface class
class Mux_2to1_IO extends Bundle {
        val in_A = Input(UInt(32.W))
        val in_B = Input(UInt(32.W))
        val select = Input(Bool())
        val out = Output(UInt(32.W))
}
// 2 to 1 Mux implementation

class Mux_2to1 extends Module {
    val io = IO (new Mux_2to1_IO)

    val select = Fill(32, io.select)
    val and_output1 = io.in_A & ~(select)
    val and_output2 = io.in_B & select
    io.out := and_output1 | and_output2
}