package com.vladsch.flexmark.ext.spec.example;

import com.vladsch.flexmark.internal.util.sequence.BasedSequence;
import com.vladsch.flexmark.node.CustomNode;

/**
 * A SpecExample block node
 */
public class SpecExampleHtml extends CustomNode {
    @Override
    public void getAstExtra(StringBuilder out) {
        astExtraChars(out);
    }

    @Override
    public BasedSequence[] getSegments() {
        return EMPTY_SEGMENTS;
    }

    public SpecExampleHtml() {
    }

    public SpecExampleHtml(BasedSequence chars) {
        super(chars);
    }
}