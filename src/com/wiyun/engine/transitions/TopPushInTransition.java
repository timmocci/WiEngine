/*
 * Copyright (c) 2010 WiYun Inc.
 * Author: luma(stubma@gmail.com)
 *
 * For all entities this program is free software; you can redistribute
 * it and/or modify it under the terms of the 'WiEngine' license with
 * the additional provision that 'WiEngine' must be credited in a manner
 * that can be be observed by end users, for example, in the credits or during
 * start up. (please find WiEngine logo in sdk's logo folder)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.wiyun.engine.transitions;

import com.wiyun.engine.nodes.Scene;

/**
 * 新的场景从顶部进入，同时把旧场景往下推
 */
public class TopPushInTransition extends TransitionScene {
	/**
	 * 静态构造函数
	 *
	 * @param duration 场景切换的时间
	 * @param inScene 准备载入的\link Scene Scene对象指针\endlink. 如果不为NULL, 则
	 * 		载出场景自动设置为当前场景. 如果为NULL, 则载入场景和载出场景都不设置. 需要在之后再
	 * 		自行设置. 一般如果是想在popScene的时候, 需要把这个参数设置为NULL, 这样\link Director Director\endlink
	 * 		会自动设置载入和载出场景.
	 * @return {@link TopPushInTransition}
	 */
	public static TopPushInTransition make(float duration, Scene inScene) {
		return new TopPushInTransition(duration, inScene);
	}

	protected TopPushInTransition(float duration, Scene inScene) {
		nativeInit(duration, inScene);
	}
	
    /**
     * 从底层指针获得一个TopPushInTransition的Java对象
     * 
     * @param pointer 底层指针
     * @return {@link TopPushInTransition}
     */
    public static TopPushInTransition from(int pointer) {
    	return pointer == 0 ? null : new TopPushInTransition(pointer);
    }
    
    protected TopPushInTransition(int pointer) {
    	super(pointer);
    }
	
	private native void nativeInit(float duration, Scene inScene);
}
