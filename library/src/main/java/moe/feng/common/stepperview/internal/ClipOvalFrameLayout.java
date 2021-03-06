package moe.feng.common.stepperview.internal;

import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;

/**
 * @hide
 */
public class ClipOvalFrameLayout extends FrameLayout {

	public ClipOvalFrameLayout(Context context) {
		super(context);
		init();
	}

	public ClipOvalFrameLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	public ClipOvalFrameLayout(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		init();
	}

	private void init() {
		setClipToOutline(true);
	}

}
