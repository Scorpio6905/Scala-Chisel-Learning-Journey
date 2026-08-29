package Gates
import chisel3._
import chisel3.util._
import java.io.File

class counter_up_down(n: Int) extends Module {
    val io = IO ( new Bundle {

        //val data_in = Input(UInt(n.W))
        //val reload = Input(Bool())
        val out = Output(Bool())
})

    val counter = RegInit(0.U(n.W))
    val max_count = RegInit(6.U(n.W))
    val down = RegInit(false.B)

    when ( counter === max_count ) {
        down := true.B
        io.out := 1.B
        counter := counter - 1.U

    }.otherwise{
        when(down === true.B){
            counter := counter - 1.U
            when(counter === 0.U){
                down := false.B
                io.out := 1.B
            }.otherwise{
                io.out := 0.B
            }
        }.otherwise{
            counter := counter + 1.U
            io.out := 0.B
          
        }
    }
}
