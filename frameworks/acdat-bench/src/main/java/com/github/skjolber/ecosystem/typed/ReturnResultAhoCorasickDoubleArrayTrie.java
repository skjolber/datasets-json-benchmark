package com.github.skjolber.ecosystem.typed;

import com.hankcs.algorithm.AhoCorasickDoubleArrayTrie;

public class ReturnResultAhoCorasickDoubleArrayTrie<V> extends AhoCorasickDoubleArrayTrie<V> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    /**
     * Parse text
     *
     * @param text      The text
     * @param processor A processor which handles the output
     */
    public V parseTextForResult(CharSequence text, IHitCancellable<V> processor)
    {
        int currentState = 0;
        for (int i = 0; i < text.length(); i++)
        {
            final int position = i + 1;
            currentState = getState(currentState, text.charAt(i));
            int[] hitArray = output[currentState];
            if (hitArray != null)
            {
                for (int hit : hitArray)
                {
                    boolean proceed = processor.hit(position - l[hit], position, v[hit]);
                    if (!proceed)
                    {
                        return v[hit];
                    }
                }
            }
        }
        return null;
    }

    /**
     * Parse text
     *
     * @param text      The text
     * @param processor A processor which handles the output
     */
    public V parseTextForResult(CharSequence text)
    {
        int currentState = 0;
        for (int i = 0; i < text.length(); i++)
        {
            currentState = getState(currentState, text.charAt(i));
            int[] hitArray = output[currentState];
            if (hitArray != null)
            {
                for (int hit : hitArray)
                {
                    return v[hit];
                }
            }
        }
        return null;
    }

    /**
     * transmit state, supports failure function
     *
     * @param currentState
     * @param character
     * @return
     */
    private int getState(int currentState, char character)
    {
        int newCurrentState = transitionWithRoot(currentState, character);  // 先按success跳转
        while (newCurrentState == -1) // 跳转失败的话，按failure跳转
        {
            currentState = fail[currentState];
            newCurrentState = transitionWithRoot(currentState, character);
        }
        return newCurrentState;
    }    
    
}
