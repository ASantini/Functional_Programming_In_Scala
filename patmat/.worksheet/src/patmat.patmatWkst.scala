package patmat


object patmatWkst {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(82); 
  val testString = Huffman.string2Chars("He");System.out.println("""testString  : List[Char] = """ + $show(testString ));$skip(44); 
  val testTimes = Huffman.times(testString);System.out.println("""testTimes  : List[(Char, Int)] = """ + $show(testTimes ));$skip(57); 
  val testfreqs = Huffman.makeOrderedLeafList(testTimes);System.out.println("""testfreqs  : List[patmat.Huffman.Leaf] = """ + $show(testfreqs ));$skip(421); 
    
    
          def insertSort(acc: List[Huffman.Leaf], remain: List[Huffman.Leaf], current: (Char,Int)): List[Huffman.Leaf] =
          remain match {
        		case List() => acc ::: List((Huffman.Leaf(current._1, current._2)))
        		case y :: ys => if(y.weight < current._2)  acc ::: Huffman.Leaf(current._1, current._2) :: y :: ys
          		else insertSort(remain.head :: acc, remain.tail, current)
      };System.out.println("""insertSort: (acc: List[patmat.Huffman.Leaf], remain: List[patmat.Huffman.Leaf], current: (Char, Int))List[patmat.Huffman.Leaf]""");$skip(61); 
      
  var testSort = insertSort(List(), List(), ('e', 1));System.out.println("""testSort  : List[patmat.Huffman.Leaf] = """ + $show(testSort ));$skip(57); 
  var testSort2 = insertSort(List(), testSort, ('H', 1));System.out.println("""testSort2  : List[patmat.Huffman.Leaf] = """ + $show(testSort2 ));$skip(58); 
  var testSort3 = insertSort(List(), testSort2, ('L', 4));System.out.println("""testSort3  : List[patmat.Huffman.Leaf] = """ + $show(testSort3 ));$skip(58); 
  var testSort4 = insertSort(List(), testSort3, ('a', 2));System.out.println("""testSort4  : List[patmat.Huffman.Leaf] = """ + $show(testSort4 ));$skip(61); 
  
  var testSort5 = insertSort(List(), testSort4, ('c', 3));System.out.println("""testSort5  : List[patmat.Huffman.Leaf] = """ + $show(testSort5 ));$skip(168); val res$0 = 
                                                  
                                                
    Huffman.makeOrderedLeafList(List(('t', 2), ('e', 1), ('x', 3)));System.out.println("""res0: List[patmat.Huffman.Leaf] = """ + $show(res$0))}
  
  
 
 
}
