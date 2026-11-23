package p555j.p556a.p557a.p619l;

import android.graphics.drawable.Drawable;
import p007c.p085g.p086a.Priority;
import p007c.p085g.p086a.p089m.Key;
import p007c.p085g.p086a.p089m.Option;
import p007c.p085g.p086a.p089m.Transformation;
import p007c.p085g.p086a.p089m.p092t.DiskCacheStrategy;
import p007c.p085g.p086a.p089m.p098v.p099d.DownsampleStrategy;
import p007c.p085g.p086a.p108q.BaseRequestOptions;
import p007c.p085g.p086a.p108q.RequestOptions;

/* JADX INFO: renamed from: j.a.a.l.h, reason: use source file name */
/* JADX INFO: compiled from: GlideOptions.java */
/* JADX INFO: loaded from: classes2.dex */
public final class GlideOptions extends RequestOptions implements Cloneable {
    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    @SafeVarargs
    /* JADX INFO: renamed from: E */
    public BaseRequestOptions mo1972E(Transformation[] transformationArr) {
        return (GlideOptions) super.mo1972E(transformationArr);
    }

    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: F */
    public BaseRequestOptions mo1973F(boolean z) {
        return (GlideOptions) super.mo1973F(z);
    }

    /* JADX INFO: renamed from: G */
    public GlideOptions m14251G(BaseRequestOptions<?> baseRequestOptions) {
        return (GlideOptions) super.mo1647a(baseRequestOptions);
    }

    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: a */
    public BaseRequestOptions mo1647a(BaseRequestOptions baseRequestOptions) {
        return (GlideOptions) super.mo1647a(baseRequestOptions);
    }

    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: b */
    public BaseRequestOptions mo1974b() {
        return (GlideOptions) super.mo1974b();
    }

    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    public Object clone() throws CloneNotSupportedException {
        return (GlideOptions) super.clone();
    }

    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: d */
    public BaseRequestOptions clone() {
        return (GlideOptions) super.clone();
    }

    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: e */
    public BaseRequestOptions mo1975e(Class cls) {
        return (GlideOptions) super.mo1975e(cls);
    }

    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: g */
    public BaseRequestOptions mo1976g(DiskCacheStrategy diskCacheStrategy) {
        return (GlideOptions) super.mo1976g(diskCacheStrategy);
    }

    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: i */
    public BaseRequestOptions mo1977i(DownsampleStrategy downsampleStrategy) {
        return (GlideOptions) super.mo1977i(downsampleStrategy);
    }

    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: j */
    public BaseRequestOptions mo1978j(Drawable drawable) {
        return (GlideOptions) super.mo1978j(drawable);
    }

    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: l */
    public BaseRequestOptions mo1979l() {
        this.f3744y = true;
        return this;
    }

    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: m */
    public BaseRequestOptions mo1980m() {
        return (GlideOptions) super.mo1980m();
    }

    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: n */
    public BaseRequestOptions mo1981n() {
        return (GlideOptions) super.mo1981n();
    }

    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: o */
    public BaseRequestOptions mo1982o() {
        return (GlideOptions) super.mo1982o();
    }

    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: q */
    public BaseRequestOptions mo1984q(int i, int i2) {
        return (GlideOptions) super.mo1984q(i, i2);
    }

    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: r */
    public BaseRequestOptions mo1985r(Drawable drawable) {
        return (GlideOptions) super.mo1985r(drawable);
    }

    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: s */
    public BaseRequestOptions mo1986s(Priority priority) {
        return (GlideOptions) super.mo1986s(priority);
    }

    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: v */
    public BaseRequestOptions mo1988v(Option option, Object obj) {
        return (GlideOptions) super.mo1988v(option, obj);
    }

    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: w */
    public BaseRequestOptions mo1989w(Key key) {
        return (GlideOptions) super.mo1989w(key);
    }

    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: x */
    public BaseRequestOptions mo1990x(boolean z) {
        return (GlideOptions) super.mo1990x(z);
    }

    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: y */
    public BaseRequestOptions mo1991y(Transformation transformation) {
        return (GlideOptions) m1992z(transformation, true);
    }
}
