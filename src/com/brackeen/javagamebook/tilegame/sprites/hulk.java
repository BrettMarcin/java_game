package com.brackeen.javagamebook.tilegame.sprites;

import com.brackeen.javagamebook.graphics.Animation;

import com.brackeen.javagamebook.util.*;
import com.brackeen.javagamebook.codereflection.*;

/**
 * @author Brett Marcinkiewicz
 */
public class hulk extends Creature {

	private static final int MILI_PER_SECOND = 1000; 
	//TODO set a jump interval to only jump after a certain number of seconds
	// have elapsed.
	private long initJumpInterval = 2 * MILI_PER_SECOND; 
	private long jumpInterval = initJumpInterval;
	private float newSpeed = 0.2f;
//    private Throwable e = new Throwable();
	
	/**
	 * @param left
	 * @param right
	 * @param deadLeft
	 * @param deadRight
	 */
	public hulk(Animation left, Animation right, Animation deadLeft, Animation deadRight) {
		super(left, right, deadLeft, deadRight);
    	if(CodeReflection.isTracing() && SpritesPackageTracingEnabled.getSpritesPackageTracingEnabledInstance().isEnabled()) {
        	if(CodeReflection.getAbstactionLevel()>=1)
        	{//check to make sure it's this level of abstraction
        		e.fillInStackTrace();		
        		CodeReflection.registerMethod(e.getStackTrace()[0].getClassName(),
        								e.getStackTrace()[0].getMethodName());
        	}
    	}
    	
		this.jumpSpeed = -1.15f;
		this.trackPlayer=true;
		health = 2;
	}
	
	//TODO Set how fast you want the hulk to move.
    public float getMaxSpeed() {
    	if(CodeReflection.isTracing() && SpritesPackageTracingEnabled.getSpritesPackageTracingEnabledInstance().isEnabled()) {
        	if(CodeReflection.getAbstactionLevel()>=2)
        	{//check to make sure it's this level of abstraction
        		e.fillInStackTrace();		
        		CodeReflection.registerMethod(e.getStackTrace()[0].getClassName(),
        								e.getStackTrace()[0].getMethodName());
        	}
    	}
    	
    	
        return newSpeed * enemySpeedMultiplier;
    }
    

    
    //TODO Extend the update method to provide new creature behavior
    // Can use time elapsed to do actions only at certain time intervals.
    
	/*
	 * @see com.brackeen.javagamebook.graphics.Sprite#update(long)
	 */
	public void update(long elapsedTime) {
		// Call super to maintain animation behavior
		super.update(elapsedTime);
    	if(CodeReflection.isTracing() && SpritesPackageTracingEnabled.getSpritesPackageTracingEnabledInstance().isEnabled()) {
        	if(CodeReflection.getAbstactionLevel()>=4)
        	{//check to make sure it's this level of abstraction
        		e.fillInStackTrace();		
        		CodeReflection.registerMethod(e.getStackTrace()[0].getClassName(),
        								e.getStackTrace()[0].getMethodName());
        	}
    	}
    	
		if((totalElapsedTime % jumpInterval)-elapsedTime<0){
			jump();
			jumpInterval = initJumpInterval + RandomUtil.getRandomInt(300);
		}
	}
}
