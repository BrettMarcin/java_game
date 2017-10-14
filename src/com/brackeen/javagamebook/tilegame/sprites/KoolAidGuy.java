package com.brackeen.javagamebook.tilegame.sprites;

import com.brackeen.javagamebook.graphics.Animation;


import com.brackeen.javagamebook.util.*;
import com.brackeen.javagamebook.codereflection.*;

/**
 * @author Dennis Lam
 */
public class KoolAidGuy extends Creature {

	private static final int MILI_PER_SECOND = 950; 
	// setting up a jump interval to only jump after a certain number of seconds
	
	private long initJumpInterval = 3 * MILI_PER_SECOND; 
	private long jumpInterval = initJumpInterval;
	// private Throwable e = new Throwable();
	
	public KoolAidGuy(Animation left, Animation right, Animation deadLeft, Animation deadRight) {
		super(left, right, deadLeft, deadRight);
    	if(CodeReflection.isTracing() && SpritesPackageTracingEnabled.getSpritesPackageTracingEnabledInstance().isEnabled()) {
        	if(CodeReflection.getAbstactionLevel()>=1)
        	{//check to make sure it's this level of abstraction
        		e.fillInStackTrace();		
        		CodeReflection.registerMethod(e.getStackTrace()[0].getClassName(),
        								e.getStackTrace()[0].getMethodName());
        	}
    	}
		
		this.jumpSpeed = -0.45f;
		this.trackPlayer=true;
		health = 3;
		
	}
	
	
	//Set up how fast the kool aid guy moving.
    public float getMaxSpeed() {
    	if(CodeReflection.isTracing() && SpritesPackageTracingEnabled.getSpritesPackageTracingEnabledInstance().isEnabled()) {
        	if(CodeReflection.getAbstactionLevel()>=2)
        	{
        		e.fillInStackTrace();		
        		CodeReflection.registerMethod(e.getStackTrace()[0].getClassName(),
        								e.getStackTrace()[0].getMethodName());
        	}
    	}
        return 0.19f * enemySpeedMultiplier;
    }
    
	public void update(long elapsedTime) {
		
		super.update(elapsedTime);
    	if(CodeReflection.isTracing() && SpritesPackageTracingEnabled.getSpritesPackageTracingEnabledInstance().isEnabled()) {
        	if(CodeReflection.getAbstactionLevel()>=4)
        	{//check to make sure it's this level of abstraction
        		e.fillInStackTrace();		
        		CodeReflection.registerMethod(e.getStackTrace()[0].getClassName(),
        								e.getStackTrace()[0].getMethodName());
        	}
    	}
		
	}
}