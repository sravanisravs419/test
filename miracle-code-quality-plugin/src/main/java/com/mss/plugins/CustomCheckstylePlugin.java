package com.mss.plugins;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.ResolutionScope;

@Mojo(name = "custom-checkstyle", defaultPhase = LifecyclePhase.VERIFY, requiresDependencyResolution = ResolutionScope.TEST)
public class CustomCheckstylePlugin extends AbstractMojo {



	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		
		getLog().info("hello....");
		
	}


    }

