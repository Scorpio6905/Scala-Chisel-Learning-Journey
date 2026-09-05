package lab3

import chisel3._
import chisel3.util._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

import scala.util.Random


// class ImmGentest extends FreeSpec with ChiselScalatestTester {
//   "ImmdValGen immediate extraction" in {
//     test(new ImmdValGen) { dut =>
      
//       val op_array = Array( "b0010011", "b0000011", "b1100111", "b0100011", "b1100011", "b0110111", "b0010111", "b1101111" ) 
//       // val opcode = op_array(Random.nextInt(8)) 
      
//       // val imm = Random.nextInt() & 0xFFF
//       // val reg = Random.nextInt(32)

//       val instr = "b00000000101000000000000010010011".U
//       val opcode = instr(6, 0)
    
//       val result = opcode match {
//         case x if x === "b0010011".U || "b0000011".U || "b1100111".U =>
//           val immbits = instr(31, 20)
//           val sign_ext = Fill(20, instr(31))
//           Cat(sign_ext, immbits)

//         case x if x==="b0100011".U =>
//           val immbits = Cat(instr(31, 25), instr(11, 7))
//           val sign_ext = Fill(20, instr(31))
//           Cat(sign_ext, immbits)

//         case x if (x == "b1100011".U).B =>
//           val immbits = Cat(instr(31), instr(7), instr(30, 25), instr(11, 8), 0.U(1.W))
//           val sign_ext = Fill(19, instr(31))
//           Cat(sign_ext, immbits)

//         case x if x === "b0110111".U || x === "b0010111".U =>
//           val immbits = instr(31, 12)
//           val bit_ext = Fill(12, 0.U)
//           Cat(immbits, bit_ext)

//         case x if x === "b1101111".U =>
//           val immbits = Cat(instr(31, 30), instr(19, 12), instr(20), instr(30, 21), 0.U(1.W))
//           val sign_ext = Fill(11, instr(31))
//           Cat(sign_ext, immbits)

//         case _ =>
//           0.U(32.W)
//       }

//       dut.io.instr.poke(instr.asUInt)
//       dut.io.immd_se.expect(result)




//     }
//   }
// }


// class ImmGentest extends FreeSpec with ChiselScalatestTester { 
//       "ImmdValGen immediate extraction" in { 
//         test(new ImmdValGen) { dut => 
//           val op_array = Array( "b0010011", "b0000011", "b1100111", "b0100011", "b1100011", "b0110111", "b0010111", "b1101111" ) 
//           // Random instruction 
//           val instruction = BigInt("00000000101000000000000010010011", 2) // Extract opcode [6:0] 
//           val opcode = instruction & 0x7F 

//           val result = opcode match { 
//             // I-Type 
//             case 0x13 | 0x03 | 0x67 => val immbits = (instruction >> 20) & 0xFFF 
//             if ((immbits & 0x800) != 0) immbits | 0xFFFFF000 else immbits 

//             // S-Type 
//             case 0x23 => val imm11_5 = (instruction >> 25) & 0x7F 
//             val imm4_0 = (instruction >> 7) & 0x1F 
//             val immbits = (imm11_5 << 5) | imm4_0 
//             if ((immbits & 0x800) != 0) immbits | 0xFFFFF000 else immbits 

//             // B-Type 
//             case 0x63 => val bit12 = (instruction >> 31) & 0x1 
//             val bit11 = (instruction >> 7) & 0x1 
//             val bit10_5 = (instruction >> 25) & 0x3F 
//             val bit4_1 = (instruction >> 8) & 0xF 
//             val immbits = (bit12 << 12) | (bit11 << 11) | (bit10_5 << 5) | (bit4_1 << 1) 
//             if ((immbits & 0x1000) != 0) immbits | 0xFFFFE000 else immbits 

//             // U-Type 
//             case 0x37 | 0x17 => val immbits = (instruction >> 12) & 0xFFFFF 
//                                 immbits << 12 

//             // J-Type 
//             case 0x6F => val bit20 = (instruction >> 31) & 0x1 
//             val bit19_12 = (instruction >> 12) & 0xFF 
//             val bit11 = (instruction >> 20) & 0x1 
//             val bit10_1 = (instruction >> 21) & 0x3FF 
//             val immbits = (bit20 << 20) | (bit19_12 << 12) | (bit11 << 11) | (bit10_1 << 1) 
//             if ((immbits & 0x100000) != 0) immbits | 0xFFE00000 else immbits case _ => 0 } // Send instruction to DUT 


//             dut.io.instr.poke(instruction.U) // Compare DUT result with Scala result 
//             dut.io.immd_se.expect(result.U) 
// } } }