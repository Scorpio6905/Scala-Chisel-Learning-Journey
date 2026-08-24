package Gates
import chisel3._
import chisel3.util._
import java.io.File

class counter_up_down(n: Int) extends Module {
    val io = IO ( new Bundle {
    
    val out = Output(Bool())
})
    val counter = RegInit(0.U(n.W))
    val max_count = RegInit(6.U(n.W))


    when ( counter === max_count ) {
        counter := 0.U
        io.out := 1.B
    }.otherwise {
        counter := counter + 1.U
        io.out := 0.B
    }
 

// Your code
}