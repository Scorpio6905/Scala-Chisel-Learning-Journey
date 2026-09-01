error id: file://<WORKSPACE>/src/main/scala/lab3/AluOps.scala:asSInt.
file://<WORKSPACE>/src/main/scala/lab3/AluOps.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3.
	 -chisel3#
	 -chisel3().
	 -chisel3/util.
	 -chisel3/util#
	 -chisel3/util().
	 -ALUOP.
	 -ALUOP#
	 -ALUOP().
	 -scala/Predef.
	 -scala/Predef#
	 -scala/Predef().
offset: 1300
uri: file://<WORKSPACE>/src/main/scala/lab3/AluOps.scala
text:
```scala
package lab3

import chisel3._
import chisel3.util._


object ALUOP {
// ALU Operations, may expand/modify in future
    val ALU_ADD = 0.U(4.W)
    val ALU_SUB = 1.U(4.W)
    val ALU_AND = 2.U(4.W)
    val ALU_OR = 3.U(4.W)
    val ALU_XOR = 4.U(4.W)
    val ALU_SLT = 5.U(4.W)
    val ALU_SLL = 6.U(4.W)
    val ALU_SLTU = 7.U(4.W)
    val ALU_SRL = 8.U(4.W)
    val ALU_SRA = 9.U(4.W)
    val ALU_COPY_A = 10.U(4.W)
    val ALU_COPY_B = 11.U(4.W)
    val ALU_XXX = 15.U(4.W)
}

trait Config {
    // word length configuration parameter
    val WLEN = 32
    // ALU operation control signal width
    val ALUOP_SIG_LEN = 4
}

import ALUOP._

class ALUIO extends Bundle with Config {
    val in_A = Input(UInt(WLEN.W))
    val in_B = Input(UInt(WLEN.W))
    val alu_Op = Input(UInt(ALUOP_SIG_LEN.W))
    val out = Output(UInt(WLEN.W))
    val sum = Output(UInt(WLEN.W))
}


class ALU extends Module with Config {
    val io = IO(new ALUIO)

    val sum = io.in_A + Mux(io.alu_Op(0),-io.in_B, io.in_B)
    val cmp = Mux(io.in_A(WLEN-1) === io.in_B(WLEN-1), sum(WLEN-1),
            Mux(io.alu_Op(1), io.in_B(WLEN-1), io.in_A(WLEN-1)))

    val shamt = io.in_B(4,0).asUInt
    val shin = Mux(io.alu_Op(3), Reverse(io.in_A), Reverse(io.in_A))
    val shiftr = (Cat(io.alu_Op(0) && shin(WLEN-1), shin).as@@SInt >> shamt)(WLEN-1, 0)
 
 
    val shiftl = Reverse(shiftr)   

    val out = Wire(UInt(WLEN.W))
    out := 0.U
   
    
    switch (io.alu_Op) {
    is (ALU_ADD, ALU_SUB) {
        out := sum
    } 

    is (ALU_SLT, ALU_SLTU){
        out := cmp
    }

    is (ALU_SRA, ALU_SRL){
        out := shiftr
    }

    is (ALU_SLL){
        out := shiftl
    }

    is (ALU_AND){
        out := (io.in_A & io.in_B)
    }

    is (ALU_OR){
        out := (io.in_A | io.in_B)
    }

    is (ALU_XOR){
        out := (io.in_A ^ io.in_B)
    }

    is (ALU_COPY_A){
        out := io.in_A
    }
    is (ALU_COPY_B){
        out := io.in_B
    }
    }

    io.out := out
    io.sum := sum

}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 