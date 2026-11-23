package p636z0.p752p.p753c;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import p636z0.p725k.p739l.OneShotPreDrawListener;

/* JADX INFO: renamed from: z0.p.c.s, reason: use source file name */
/* JADX INFO: compiled from: FragmentAnim.java */
/* JADX INFO: loaded from: classes.dex */
public class FragmentAnim5 extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: f */
    public final ViewGroup f38543f;

    /* JADX INFO: renamed from: g */
    public final View f38544g;

    /* JADX INFO: renamed from: h */
    public boolean f38545h;

    /* JADX INFO: renamed from: i */
    public boolean f38546i;

    /* JADX INFO: renamed from: j */
    public boolean f38547j;

    public FragmentAnim5(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f38547j = true;
        this.f38543f = viewGroup;
        this.f38544g = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public boolean getTransformation(long j2, Transformation transformation) {
        this.f38547j = true;
        if (this.f38545h) {
            return !this.f38546i;
        }
        if (!super.getTransformation(j2, transformation)) {
            this.f38545h = true;
            OneShotPreDrawListener.m16304a(this.f38543f, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f38545h || !this.f38547j) {
            this.f38543f.endViewTransition(this.f38544g);
            this.f38546i = true;
        } else {
            this.f38547j = false;
            this.f38543f.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public boolean getTransformation(long j2, Transformation transformation, float f) {
        this.f38547j = true;
        if (this.f38545h) {
            return !this.f38546i;
        }
        if (!super.getTransformation(j2, transformation, f)) {
            this.f38545h = true;
            OneShotPreDrawListener.m16304a(this.f38543f, this);
        }
        return true;
    }
}
