package lab3
import chisel3._
import chisel3.util._
import scala.annotation.switch

class LM_IO_Interface_BranchControl extends Bundle {
    val funct3 = Input(UInt(3.W))
    val branch = Input(Bool())
    val arg_x = Input(UInt(32.W))
    val arg_y = Input(UInt(32.W))
    val br_taken = Output(Bool())
}


class BranchControl extends Module {
    val io = IO(new LM_IO_Interface_BranchControl)

    io.br_taken := false.B

    when(io.branch) {
        switch(io.funct3) {
            is ("b000".U){
                when(io.arg_x === io.arg_y){
                    io.br_taken := true.B
                }.otherwise{
                    io.br_taken := false.B
                }
            }

            is ("b001".U){
                when(io.arg_x =/= io.arg_y){
                    io.br_taken := true.B
                }.otherwise{
                    io.br_taken := false.B
                }
            }

            is ("b100".U){
                when(io.arg_x < io.arg_y){
                    io.br_taken := true.B
                }.otherwise{
                    io.br_taken := false.B
                }
            }

            is ("b101".U){
                when(io.arg_x >= io.arg_y){
                    io.br_taken := true.B
                }.otherwise{
                    io.br_taken := false.B
                }
            }

            is ("b110".U){
                when(io.arg_x.asUInt < io.arg_y.asUInt){
                    io.br_taken := true.B
                }.otherwise{
                    io.br_taken := false.B
                }
            }

            is ("b111".U){
                when(io.arg_x.asUInt >= io.arg_y.asUInt){
                    io.br_taken := true.B
                }.otherwise{
                    io.br_taken := false.B
                }
            }

        }
    }.otherwise{
        io.br_taken := false.B
    }

}

