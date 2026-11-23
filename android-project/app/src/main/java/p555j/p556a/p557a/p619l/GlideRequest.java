package p555j.p556a.p557a.p619l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import p007c.p085g.p086a.Glide;
import p007c.p085g.p086a.Priority;
import p007c.p085g.p086a.RequestBuilder;
import p007c.p085g.p086a.RequestManager;
import p007c.p085g.p086a.p089m.Key;
import p007c.p085g.p086a.p089m.Option;
import p007c.p085g.p086a.p089m.Transformation;
import p007c.p085g.p086a.p089m.p092t.DiskCacheStrategy;
import p007c.p085g.p086a.p089m.p098v.p099d.DownsampleStrategy;
import p007c.p085g.p086a.p108q.BaseRequestOptions;
import p007c.p085g.p086a.p108q.RequestListener;

/* JADX INFO: renamed from: j.a.a.l.i, reason: use source file name */
/* JADX INFO: compiled from: GlideRequest.java */
/* JADX INFO: loaded from: classes2.dex */
public class GlideRequest<TranscodeType> extends RequestBuilder<TranscodeType> implements Cloneable {
    public GlideRequest(Glide glide, RequestManager requestManager, Class<TranscodeType> cls, Context context) {
        super(glide, requestManager, cls, context);
    }

    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: F */
    public BaseRequestOptions mo1973F(boolean z) {
        return (GlideRequest) super.mo1973F(z);
    }

    @Override // p007c.p085g.p086a.RequestBuilder
    /* JADX INFO: renamed from: G */
    public RequestBuilder mo1636G(RequestListener requestListener) {
        if (requestListener != null) {
            if (this.f2911L == null) {
                this.f2911L = new ArrayList();
            }
            this.f2911L.add(requestListener);
        }
        return this;
    }

    @Override // p007c.p085g.p086a.RequestBuilder
    /* JADX INFO: renamed from: I */
    public RequestBuilder mo1647a(BaseRequestOptions baseRequestOptions) {
        return (GlideRequest) super.mo1647a(baseRequestOptions);
    }

    @Override // p007c.p085g.p086a.RequestBuilder
    /* JADX INFO: renamed from: O */
    public RequestBuilder mo1643O(Integer num) {
        return (GlideRequest) super.mo1643O(num);
    }

    @Override // p007c.p085g.p086a.RequestBuilder
    /* JADX INFO: renamed from: P */
    public RequestBuilder mo1644P(Object obj) {
        this.f2910K = obj;
        this.f2913N = true;
        return this;
    }

    @Override // p007c.p085g.p086a.RequestBuilder
    /* JADX INFO: renamed from: Q */
    public RequestBuilder mo1645Q(String str) {
        this.f2910K = str;
        this.f2913N = true;
        return this;
    }

    /* JADX INFO: renamed from: S */
    public GlideRequest<TranscodeType> m14252S(BaseRequestOptions<?> baseRequestOptions) {
        return (GlideRequest) super.mo1647a(baseRequestOptions);
    }

    @Override // p007c.p085g.p086a.RequestBuilder, p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public GlideRequest<TranscodeType> clone() {
        return (GlideRequest) super.clone();
    }

    @Override // p007c.p085g.p086a.RequestBuilder, p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: a */
    public BaseRequestOptions mo1647a(BaseRequestOptions baseRequestOptions) {
        return (GlideRequest) super.mo1647a(baseRequestOptions);
    }

    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: e */
    public BaseRequestOptions mo1975e(Class cls) {
        return (GlideRequest) super.mo1975e(cls);
    }

    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: g */
    public BaseRequestOptions mo1976g(DiskCacheStrategy diskCacheStrategy) {
        return (GlideRequest) super.mo1976g(diskCacheStrategy);
    }

    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: i */
    public BaseRequestOptions mo1977i(DownsampleStrategy downsampleStrategy) {
        return (GlideRequest) super.mo1977i(downsampleStrategy);
    }

    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: j */
    public BaseRequestOptions mo1978j(Drawable drawable) {
        return (GlideRequest) super.mo1978j(drawable);
    }

    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: m */
    public BaseRequestOptions mo1980m() {
        return (GlideRequest) super.mo1980m();
    }

    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: n */
    public BaseRequestOptions mo1981n() {
        return (GlideRequest) super.mo1981n();
    }

    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: o */
    public BaseRequestOptions mo1982o() {
        return (GlideRequest) super.mo1982o();
    }

    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: q */
    public BaseRequestOptions mo1984q(int i, int i2) {
        return (GlideRequest) super.mo1984q(i, i2);
    }

    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: r */
    public BaseRequestOptions mo1985r(Drawable drawable) {
        return (GlideRequest) super.mo1985r(drawable);
    }

    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: s */
    public BaseRequestOptions mo1986s(Priority priority) {
        return (GlideRequest) super.mo1986s(priority);
    }

    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: v */
    public BaseRequestOptions mo1988v(Option option, Object obj) {
        return (GlideRequest) super.mo1988v(option, obj);
    }

    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: w */
    public BaseRequestOptions mo1989w(Key key) {
        return (GlideRequest) super.mo1989w(key);
    }

    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: x */
    public BaseRequestOptions mo1990x(boolean z) {
        return (GlideRequest) super.mo1990x(z);
    }

    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: y */
    public BaseRequestOptions mo1991y(Transformation transformation) {
        return (GlideRequest) m1992z(transformation, true);
    }
}
