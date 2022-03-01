  
   def countWords(str: String): Array[Int] = {
       //split the string into a list
       //get the count of eachd element
       
       val splittedString: Array[String] =  str.split(" ")

       val result: Array[Int] = splittedString.map(x => x.length)

       result

    }


    "To be or not to be is not the question but to suffer the sling and arrows of outrageous fortune".split(" ").map(_.length)