package p007c.p056c.p057a.p058a0;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import p007c.p056c.p057a.FontAssetDelegate;
import p007c.p056c.p057a.p059b0.MutablePair;
import p007c.p056c.p057a.p066e0.Logger2;

/* JADX INFO: renamed from: c.c.a.a0.a, reason: use source file name */
/* JADX INFO: compiled from: FontAssetManager.java */
/* JADX INFO: loaded from: classes.dex */
public class FontAssetManager {

    /* JADX INFO: renamed from: d */
    public final AssetManager f1958d;

    /* JADX INFO: renamed from: e */
    public FontAssetDelegate f1959e;

    /* JADX INFO: renamed from: a */
    public final MutablePair<String> f1955a = new MutablePair<>();

    /* JADX INFO: renamed from: b */
    public final Map<MutablePair<String>, Typeface> f1956b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Map<String, Typeface> f1957c = new HashMap();

    /* JADX INFO: renamed from: f */
    public String f1960f = ".ttf";

    public FontAssetManager(Drawable.Callback callback, FontAssetDelegate fontAssetDelegate) {
        this.f1959e = fontAssetDelegate;
        if (callback instanceof View) {
            this.f1958d = ((View) callback).getContext().getAssets();
        } else {
            Logger2.m1420b("LottieDrawable must be inside of a view for images to work.");
            this.f1958d = null;
        }
    }
}
