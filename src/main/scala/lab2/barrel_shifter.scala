package lab2

import chisel3._
import chisel3.util._

class barrel_shift extends Module {
    val io = IO(new Bundle {
        val in = Vec(4, Input(Bool()))
        val sel = Vec(2, Input(Bool()))
        val shift_type = Input(Bool())
        val out = Vec(4, Output(Bool()))
    })

    io.out(0) := MuxCase(false.B, Array(
        (io.sel(0) === 0.B && io.sel(1) === 0.B) -> io.in(0),
        (io.sel(0) === 0.B && io.sel(1) === 1.B) -> io.in(1),
        (io.sel(0) === 1.B && io.sel(1) === 0.B) -> io.in(2),
        (io.sel(0) === 1.B && io.sel(1) === 1.B) -> io.in(3)
    ))

    io.out(1) := MuxCase(false.B, Array(
        (io.sel(0) === 0.B && io.sel(1) === 0.B) -> io.in(1),
        (io.sel(0) === 0.B && io.sel(1) === 1.B) -> io.in(2),
        (io.sel(0) === 1.B && io.sel(1) === 0.B) -> io.in(3),
        (io.sel(0) === 1.B && io.sel(1) === 1.B) -> MuxLookup(io.shift_type, false.B, Array(
            (0.B) -> 0.B,
            (1.B) -> io.in(0)
        ))
    ))

    io.out(2) := MuxCase(false.B, Array(
        (io.sel(0) === 0.B && io.sel(1) === 0.B) -> io.in(2),
        (io.sel(0) === 0.B && io.sel(1) === 1.B) -> io.in(3),
        (io.sel(0) === 1.B && io.sel(1) === 0.B) -> MuxLookup(io.shift_type, false.B, Array(
            (0.B) -> 0.B,
            (1.B) -> io.in(0)
        )),
        (io.sel(0) === 1.B && io.sel(1) === 1.B) -> MuxLookup(io.shift_type, false.B, Array(
            (0.B) -> 0.B,
            (1.B) -> io.in(1)
        ))
    ))

    io.out(3) := MuxCase(false.B, Array(
        (io.sel(0) === 0.B && io.sel(1) === 0.B) -> io.in(3),
        (io.sel(0) === 0.B && io.sel(1) === 1.B) -> MuxLookup(io.shift_type, false.B, Array(
            (0.B) -> 0.B,
            (1.B) -> io.in(0)
        )),
        (io.sel(0) === 1.B && io.sel(1) === 0.B) -> MuxLookup(io.shift_type, false.B, Array(
            (0.B) -> 0.B,
            (1.B) -> io.in(1)
        )),
        (io.sel(0) === 1.B && io.sel(1) === 1.B) -> MuxLookup(io.shift_type, false.B, Array(
            (0.B) -> 0.B,
            (1.B) -> io.in(2)
        ))
    ))
}

