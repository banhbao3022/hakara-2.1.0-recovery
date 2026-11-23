package p007c.p190n.p194b.p334e.p359s;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;
import java.util.Objects;
import p007c.p190n.p194b.p334e.p337c.AnimationUtils;
import p007c.p190n.p194b.p334e.p337c.AnimatorSetCompat;
import p007c.p190n.p194b.p334e.p337c.MotionSpec;

/* JADX INFO: renamed from: c.n.b.e.s.b, reason: use source file name */
/* JADX INFO: compiled from: BaseMotionStrategy.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseMotionStrategy implements MotionStrategy {

    /* JADX INFO: renamed from: a */
    public final Context f25330a;

    /* JADX INFO: renamed from: b */
    public final ExtendedFloatingActionButton f25331b;

    /* JADX INFO: renamed from: c */
    public final ArrayList<Animator.AnimatorListener> f25332c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public final AnimatorTracker f25333d;

    /* JADX INFO: renamed from: e */
    public MotionSpec f25334e;

    /* JADX INFO: renamed from: f */
    public MotionSpec f25335f;

    /* JADX INFO: renamed from: c.n.b.e.s.b$a */
    /* JADX INFO: compiled from: BaseMotionStrategy.java */
    public class a extends Property<ExtendedFloatingActionButton, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            ExtendedFloatingActionButton extendedFloatingActionButton2 = extendedFloatingActionButton;
            return Float.valueOf(AnimationUtils.m11030a(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton2.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton2.f28964N.getColorForState(extendedFloatingActionButton2.getDrawableState(), BaseMotionStrategy.this.f25331b.f28964N.getDefaultColor()))));
        }

        @Override // android.util.Property
        public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f) {
            ExtendedFloatingActionButton extendedFloatingActionButton2 = extendedFloatingActionButton;
            Float f2 = f;
            int colorForState = extendedFloatingActionButton2.f28964N.getColorForState(extendedFloatingActionButton2.getDrawableState(), BaseMotionStrategy.this.f25331b.f28964N.getDefaultColor());
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(Color.argb((int) (AnimationUtils.m11030a(0.0f, Color.alpha(colorForState) / 255.0f, f2.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f2.floatValue() == 1.0f) {
                extendedFloatingActionButton2.m12792l(extendedFloatingActionButton2.f28964N);
            } else {
                extendedFloatingActionButton2.m12792l(colorStateListValueOf);
            }
        }
    }

    public BaseMotionStrategy(ExtendedFloatingActionButton extendedFloatingActionButton, AnimatorTracker animatorTracker) {
        this.f25331b = extendedFloatingActionButton;
        this.f25330a = extendedFloatingActionButton.getContext();
        this.f25333d = animatorTracker;
    }

    @Override // p007c.p190n.p194b.p334e.p359s.MotionStrategy
    /* JADX INFO: renamed from: a */
    public void mo11264a() {
        this.f25333d.f25329a = null;
    }

    @Override // p007c.p190n.p194b.p334e.p359s.MotionStrategy
    /* JADX INFO: renamed from: e */
    public void mo11265e() {
        this.f25333d.f25329a = null;
    }

    @Override // p007c.p190n.p194b.p334e.p359s.MotionStrategy
    /* JADX INFO: renamed from: f */
    public AnimatorSet mo11266f() {
        return m11267h(m11268i());
    }

    /* JADX INFO: renamed from: h */
    public AnimatorSet m11267h(MotionSpec motionSpec) {
        ArrayList arrayList = new ArrayList();
        if (motionSpec.m11040g("opacity")) {
            arrayList.add(motionSpec.m11037d("opacity", this.f25331b, View.ALPHA));
        }
        if (motionSpec.m11040g("scale")) {
            arrayList.add(motionSpec.m11037d("scale", this.f25331b, View.SCALE_Y));
            arrayList.add(motionSpec.m11037d("scale", this.f25331b, View.SCALE_X));
        }
        if (motionSpec.m11040g("width")) {
            arrayList.add(motionSpec.m11037d("width", this.f25331b, ExtendedFloatingActionButton.f28947w));
        }
        if (motionSpec.m11040g("height")) {
            arrayList.add(motionSpec.m11037d("height", this.f25331b, ExtendedFloatingActionButton.f28948x));
        }
        if (motionSpec.m11040g("paddingStart")) {
            arrayList.add(motionSpec.m11037d("paddingStart", this.f25331b, ExtendedFloatingActionButton.f28949y));
        }
        if (motionSpec.m11040g("paddingEnd")) {
            arrayList.add(motionSpec.m11037d("paddingEnd", this.f25331b, ExtendedFloatingActionButton.f28950z));
        }
        if (motionSpec.m11040g("labelOpacity")) {
            arrayList.add(motionSpec.m11037d("labelOpacity", this.f25331b, new a(Float.class, "LABEL_OPACITY_PROPERTY")));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.m11032a(animatorSet, arrayList);
        return animatorSet;
    }

    /* JADX INFO: renamed from: i */
    public final MotionSpec m11268i() {
        MotionSpec motionSpec = this.f25335f;
        if (motionSpec != null) {
            return motionSpec;
        }
        if (this.f25334e == null) {
            this.f25334e = MotionSpec.m11035b(this.f25330a, mo11298b());
        }
        MotionSpec motionSpec2 = this.f25334e;
        Objects.requireNonNull(motionSpec2);
        return motionSpec2;
    }

    @Override // p007c.p190n.p194b.p334e.p359s.MotionStrategy
    public void onAnimationStart(Animator animator) {
        AnimatorTracker animatorTracker = this.f25333d;
        Animator animator2 = animatorTracker.f25329a;
        if (animator2 != null) {
            animator2.cancel();
        }
        animatorTracker.f25329a = animator;
    }
}
