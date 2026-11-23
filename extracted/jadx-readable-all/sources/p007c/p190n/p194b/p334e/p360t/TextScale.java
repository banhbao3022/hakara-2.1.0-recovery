package p007c.p190n.p194b.p334e.p360t;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;
import p636z0.p685e0.Transition3;
import p636z0.p685e0.TransitionValues;

/* JADX INFO: renamed from: c.n.b.e.t.i, reason: use source file name */
/* JADX INFO: compiled from: TextScale.java */
/* JADX INFO: loaded from: classes.dex */
public class TextScale extends Transition3 {

    /* JADX INFO: renamed from: c.n.b.e.t.i$a */
    /* JADX INFO: compiled from: TextScale.java */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TextView f25505a;

        public a(TextScale textScale, TextView textView) {
            this.f25505a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f25505a.setScaleX(fFloatValue);
            this.f25505a.setScaleY(fFloatValue);
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m11340O(TransitionValues transitionValues) {
        View view = transitionValues.f36493b;
        if (view instanceof TextView) {
            transitionValues.f36492a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // p636z0.p685e0.Transition3
    /* JADX INFO: renamed from: e */
    public void mo11341e(TransitionValues transitionValues) {
        m11340O(transitionValues);
    }

    @Override // p636z0.p685e0.Transition3
    /* JADX INFO: renamed from: j */
    public void mo11342j(TransitionValues transitionValues) {
        m11340O(transitionValues);
    }

    @Override // p636z0.p685e0.Transition3
    /* JADX INFO: renamed from: n */
    public Animator mo11343n(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null || !(transitionValues.f36493b instanceof TextView)) {
            return null;
        }
        View view = transitionValues2.f36493b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map<String, Object> map = transitionValues.f36492a;
        Map<String, Object> map2 = transitionValues2.f36492a;
        float fFloatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float fFloatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new a(this, textView));
        return valueAnimatorOfFloat;
    }
}
