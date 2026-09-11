import chisel3._
import chisel3.util._

class InstructionDecode extends Module {

  val io = IO(new Bundle {
    val opcode = Input(UInt(7.W))

    val format = Output(UInt(4.W))
  })

  val R_Type = 0.U(4.W)
  val Load = 1.U(4.W)
  val Store = 2.U(4.W)
  val Branch = 3.U(4.W)
  val I_Type = 4.U(4.W)
  val JALR = 5.U(4.W)
  val JAL = 6.U(4.W)
  val LUI = 7.U(4.w)

 
  val opcodeArray = Array(
    51,   // R-type  
    19,   // I-type  
    35,   // Store 
    99,   // Branch  
    55,   // LUI
    111,  // JAL
    3,    // LOAD
    103   // JALR
  )

  // Default = invalid
  io.format := 0.U

  switch(io.opcode) {

    is(opcodeArray(0)) {
      io.format := R_TYPE
    }

    is(opcodeArray(1)) {
      io.format := I_TYPE
    }

    is(opcodeArray(2)) {
      io.format := Store
    }

    is(opcodeArray(3)) {
      io.format := Branch
    }

    is(opcodeArray(4)) {
      io.format := LUI
    }

    is(opcodeArray(5)) {
      io.format := JAL
    }

    is(opcodeArray(6)) {
      io.format := LOAD
    }

    is(opcodeArray(7)) {
      io.format := JALR
    }

    is(opcodeArray(8)) {
      io.format := I_TYPE
    }
  }
}