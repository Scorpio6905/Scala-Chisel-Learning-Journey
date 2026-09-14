package regfile

import chisel3._


class PC extends Module{
    val io = IO(new Bundle{
        val PC_IN = Input(UInt(32.W))
        val PC_OUT = Output(UInt(32.W))
        val PC_NEXT = Output(UInt(32.W))
    })
    
    
    
    val reg = RegInit(0.U(32.W))
    reg := io.PC_IN

    io.PC_OUT := reg
    io.PC_NEXT := reg + 4.U

    // reg := io.PC_NEXT    
}