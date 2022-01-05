package programmingBasicsJava

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Basics {
	
	@Keyword
	public void Strings() {
		// In java, comments are made like this --> // 
		// Group comments are made like this
		/*
		 * In java we have to specify the datatype before naming the variable
		 * In groovy we can use def to avoid specifying the datatype
		 * In groovy we also do not need ";" at the end of every command unlike Java
		 * Groovy can use java, since it is built on top of it. Java can however not use Groovy methods/functions/syntax
		 */
		String myString = "Omar"
		def myGroovyString = "Totangy"
		// def can also be used to define a function
		print(selectLongestWord([myString,myGroovyString]))
		
		
	}
	
	def selectLongestWord(def stringArray) {
		int smallestWordCount = Integer.MAX_VALUE
		stringArray.each { s -> 
			smallestWordCount = s <= smallestWordCount ? s : smallestWordCount
		}
		return smallestWordCount
	}
}
