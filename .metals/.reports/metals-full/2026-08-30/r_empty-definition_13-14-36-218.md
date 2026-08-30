error id: file://<WORKSPACE>/src/main/scala/lab3/AluOps.scala:`<error>`#`<error>`.
file://<WORKSPACE>/src/main/scala/lab3/AluOps.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel/ALU_SLL.
	 -ALU_SLL.
	 -scala/Predef.ALU_SLL.
offset: 1520
uri: file://<WORKSPACE>/src/main/scala/lab3/AluOps.scala
text:
```scala
package lab3

import chisel._

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
    val WLEN
    = 32
    // ALU operation control signal width
    val ALUOP_SIG_LEN = 4
}

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
    val cmp = Mux(io.in_A (XLEN-1) === io.in_B(XLEN-1), sum(XLEN-1),
            Mux(io.alu_Op(1), io.in_B(XLEN-1), io.in_A(XLEN-1)))

    val shamt = io.in_B(4,0).asUInt
    val shin = Mux(io.alu_Op(3), io.in_A, Reverse(io.in_A))
    val shiftr = (Cat(io.alu_Op(0) && shin(XLEN-1), shin).asSInt >> shamt)(XLEN-1, 0)
 
 
    val shiftl = Reverse(shiftr)   


    switch (io.alu_Op) {
    is (ALU_ADD.U || ALU_SUB.U) {
         sum
    } 

    is (ALU_SLT.U || ALU_SLTU.U){
        cmp
    }

    is( ALU_SRA.U || ALU_SRL.U){
        shiftr
    }

    is( @@ALU_SLL.U){
         shiftl
    }

      is( ALU_SLL.U){
         shiftl
    }





  }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 