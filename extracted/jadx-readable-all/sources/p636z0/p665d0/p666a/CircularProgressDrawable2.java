package p636z0.p665d0.p666a;

import android.animation.Animator;

/* JADX INFO: renamed from: z0.d0.a.c, reason: use source file name */
/* JADX INFO: compiled from: CircularProgressDrawable.java */
/* JADX INFO: loaded from: classes.dex */
public class CircularProgressDrawable2 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CircularProgressDrawable3.a f35379a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CircularProgressDrawable3 f35380b;

    public CircularProgressDrawable2(CircularProgressDrawable3 circularProgressDrawable3, CircularProgressDrawable3.a aVar) {
        this.f35380b = circularProgressDrawable3;
        this.f35379a = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        this.f35380b.m15062a(1.0f, this.f35379a, true);
        CircularProgressDrawable3.a aVar = this.f35379a;
        aVar.f35400k = aVar.f35394e;
        aVar.f35401l = aVar.f35395f;
        aVar.f35402m = aVar.f35396g;
        aVar.m15066a((aVar.f35399j + 1) % aVar.f35398i.length);
        CircularProgressDrawable3 circularProgressDrawable3 = this.f35380b;
        if (!circularProgressDrawable3.f35389n) {
            circularProgressDrawable3.f35388m += 1.0f;
            return;
        }
        circularProgressDrawable3.f35389n = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        this.f35379a.m15067b(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f35380b.f35388m = 0.0f;
    }
}
