package Lab2

import chisel3._

class LM_IO_Interface extends Bundle {
  val s0 = Input(Bool())
  val s1 = Input(Bool())
  val s2 = Input(Bool())
  val out = Output(UInt(32.W))
}

class Mux_5to1 extends Module {
  val io = IO(new LM_IO_Interface)

  val sel = Cat(io.s2, io.s1, io.s0)

  switch(sel) {
    is(0.U(3.W)) { io.out := 0.U }
    is(1.U(3.W)) { io.out := 8.U }
    is(2.U(3.W)) { io.out := 16.U }
    is(3.U(3.W)) { io.out := 24.U }
    is("b100".U) { io.out := 32.U }
  }
}
