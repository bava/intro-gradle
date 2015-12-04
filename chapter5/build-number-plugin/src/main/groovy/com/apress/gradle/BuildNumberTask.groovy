package com.apress.gradle;

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class BuildNumberTask extends DefaultTask {
	
    @TaskAction
    def generateBuildNumber() {
        String numberType = project.buildNumber.numberType
	    int alphaNumLength = project.buildNumber.alphaNumLength
		
		def buildNumber;
		
		if("alphanumeric".equals (numberType)) {
			buildNumber = getAlphaNumString(alphaNumLength)	
		}		
		else if ( "timestamp".equals (numberType) ) {
			buildNumber = System.currentTimeMillis()
		}		   
		
		project.buildNumber.value = buildNumber;
    }
	
	def getAlphaNumString(length) {
		String uuid = UUID.randomUUID().toString()
		uuid.take(length)
	}
}