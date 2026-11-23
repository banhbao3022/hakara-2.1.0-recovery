package p007c.p165l.p166h0.p168c0;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import java.lang.ref.WeakReference;
import p007c.p165l.FacebookSdk;
import p007c.p165l.p166h0.p168c0.p169p.EventBinding;
import p007c.p165l.p166h0.p168c0.p169p.ViewHierarchy;
import p007c.p165l.p166h0.p171e0.AppEventUtility;

/* JADX INFO: renamed from: c.l.h0.c0.b, reason: use source file name */
/* JADX INFO: compiled from: CodelessLoggingEventListener.java */
/* JADX INFO: loaded from: classes.dex */
public class CodelessLoggingEventListener2 {

    /* JADX INFO: renamed from: c.l.h0.c0.b$a */
    /* JADX INFO: compiled from: CodelessLoggingEventListener.java */
    public static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: f */
        public EventBinding f4612f;

        /* JADX INFO: renamed from: g */
        public WeakReference<View> f4613g;

        /* JADX INFO: renamed from: h */
        public WeakReference<View> f4614h;

        /* JADX INFO: renamed from: i */
        public View.OnClickListener f4615i;

        /* JADX INFO: renamed from: j */
        public boolean f4616j;

        public a(EventBinding eventBinding, View view, View view2, CodelessLoggingEventListener codelessLoggingEventListener) {
            this.f4616j = false;
            if (eventBinding == null || view == null || view2 == null) {
                return;
            }
            this.f4615i = ViewHierarchy.m2301e(view2);
            this.f4612f = eventBinding;
            this.f4613g = new WeakReference<>(view2);
            this.f4614h = new WeakReference<>(view);
            this.f4616j = true;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            View.OnClickListener onClickListener = this.f4615i;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            if (this.f4614h.get() == null || this.f4613g.get() == null) {
                return;
            }
            CodelessLoggingEventListener2.m2287a(this.f4612f, this.f4614h.get(), this.f4613g.get());
        }
    }

    /* JADX INFO: renamed from: c.l.h0.c0.b$b */
    /* JADX INFO: compiled from: CodelessLoggingEventListener.java */
    public static class b implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: f */
        public EventBinding f4617f;

        /* JADX INFO: renamed from: g */
        public WeakReference<AdapterView> f4618g;

        /* JADX INFO: renamed from: h */
        public WeakReference<View> f4619h;

        /* JADX INFO: renamed from: i */
        public AdapterView.OnItemClickListener f4620i;

        /* JADX INFO: renamed from: j */
        public boolean f4621j;

        public b(EventBinding eventBinding, View view, AdapterView adapterView, CodelessLoggingEventListener codelessLoggingEventListener) {
            this.f4621j = false;
            if (eventBinding == null || view == null || adapterView == null) {
                return;
            }
            this.f4620i = adapterView.getOnItemClickListener();
            this.f4617f = eventBinding;
            this.f4618g = new WeakReference<>(adapterView);
            this.f4619h = new WeakReference<>(view);
            this.f4621j = true;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j2) {
            AdapterView.OnItemClickListener onItemClickListener = this.f4620i;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i, j2);
            }
            if (this.f4619h.get() == null || this.f4618g.get() == null) {
                return;
            }
            CodelessLoggingEventListener2.m2287a(this.f4617f, this.f4619h.get(), this.f4618g.get());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2287a(EventBinding eventBinding, View view, View view2) {
        String str = eventBinding.f4666a;
        Bundle bundleM2289b = CodelessMatcher2.m2289b(eventBinding, view, view2);
        if (bundleM2289b.containsKey("_valueToSum")) {
            bundleM2289b.putDouble("_valueToSum", AppEventUtility.m2316b(bundleM2289b.getString("_valueToSum")));
        }
        bundleM2289b.putString("_is_fb_codeless", "1");
        FacebookSdk.m2660b().execute(new CodelessLoggingEventListener(str, bundleM2289b));
    }
}
