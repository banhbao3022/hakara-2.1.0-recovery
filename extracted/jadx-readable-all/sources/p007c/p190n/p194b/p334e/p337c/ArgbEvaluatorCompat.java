package p007c.p190n.p194b.p334e.p337c;

import android.animation.TypeEvaluator;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.e.c.c, reason: use source file name */
/* JADX INFO: compiled from: ArgbEvaluatorCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class ArgbEvaluatorCompat implements TypeEvaluator<Integer> {

    /* JADX INFO: renamed from: a */
    public static final ArgbEvaluatorCompat f24798a = new ArgbEvaluatorCompat();

    @Override // android.animation.TypeEvaluator
    public Integer evaluate(float f, Integer num, Integer num2) {
        int iIntValue = num.intValue();
        float f2 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = num2.intValue();
        float f3 = ((iIntValue2 >> 24) & 255) / 255.0f;
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
        float fM1576a = outline.m1576a(f3, f2, f, f2);
        float fM1576a2 = outline.m1576a(fPow4, fPow, f, fPow);
        float fM1576a3 = outline.m1576a(fPow5, fPow2, f, fPow2);
        float fM1576a4 = outline.m1576a(fPow6, fPow3, f, fPow3);
        float fPow7 = ((float) Math.pow(fM1576a2, 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fM1576a3, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(fM1576a4, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fM1576a * 255.0f) << 24) | (Math.round(fPow8) << 8));
    }
}
