package recfun

object testingWorksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(85); 
  println("Welcome to the Scala worksheet");$skip(526); 
  
      def pascal(c: Int, r: Int): Int = {
      	def getRow(r: Int, row: List[Int]): List[Int] =
        	if(r == row.size - 1) row
        	else getRow(r, nextRow(row, List(1)))
        
      	def nextRow(row: List[Int], acc: List[Int]) : List[Int]=
          if(row.isEmpty) acc
          else nextRow(row.tail, acc ::: nextElement(row))
        
      	def nextElement(row: List[Int]) : List[Int] =
        	if (row.tail.isEmpty) List(1)
        	else List(row.head + row.tail.head)
        getRow(r, List(1))(c)
    };System.out.println("""pascal: (c: Int, r: Int)Int""");$skip(21); val res$0 = 
    
    pascal(3,6);System.out.println("""res0: Int = """ + $show(res$0))}
}
