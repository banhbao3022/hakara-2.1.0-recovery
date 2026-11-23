package androidx.databinding;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Objects;
import mtp.media.karaoke.R;
import p636z0.p748n.BaseObservable;
import p636z0.p748n.CallbackRegistry;
import p636z0.p748n.DataBindingComponent;
import p636z0.p748n.DataBindingUtil;
import p636z0.p748n.OnRebindCallback;
import p636z0.p748n.ViewDataBinding2;
import p636z0.p759s.Lifecycle3;
import p636z0.p759s.LifecycleObserver;
import p636z0.p759s.LifecycleOwner;
import p636z0.p759s.Observer;
import p636z0.p759s.OnLifecycleEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract class ViewDataBinding extends BaseObservable {

    /* JADX INFO: renamed from: b */
    public static int f717b;

    /* JADX INFO: renamed from: c */
    public static final boolean f718c;

    /* JADX INFO: renamed from: d */
    public static final InterfaceC0116f f719d;

    /* JADX INFO: renamed from: e */
    public static final ReferenceQueue<ViewDataBinding> f720e;

    /* JADX INFO: renamed from: f */
    public static final View.OnAttachStateChangeListener f721f;

    /* JADX INFO: renamed from: g */
    public final Runnable f722g;

    /* JADX INFO: renamed from: h */
    public boolean f723h;

    /* JADX INFO: renamed from: i */
    public boolean f724i;

    /* JADX INFO: renamed from: j */
    public C0120j[] f725j;

    /* JADX INFO: renamed from: k */
    public final View f726k;

    /* JADX INFO: renamed from: l */
    public boolean f727l;

    /* JADX INFO: renamed from: m */
    public Choreographer f728m;

    /* JADX INFO: renamed from: n */
    public final Choreographer.FrameCallback f729n;

    /* JADX INFO: renamed from: o */
    public Handler f730o;

    /* JADX INFO: renamed from: p */
    public final DataBindingComponent f731p;

    /* JADX INFO: renamed from: q */
    public LifecycleOwner f732q;

    /* JADX INFO: renamed from: r */
    public OnStartListener f733r;

    /* JADX INFO: renamed from: s */
    public boolean f734s;

    public static class OnStartListener implements LifecycleObserver {

        /* JADX INFO: renamed from: f */
        public final WeakReference<ViewDataBinding> f735f;

        public /* synthetic */ OnStartListener(ViewDataBinding viewDataBinding, C0111a c0111a) {
            this(viewDataBinding);
        }

        @OnLifecycleEvent(Lifecycle3.a.ON_START)
        public void onStart() {
            ViewDataBinding viewDataBinding = this.f735f.get();
            if (viewDataBinding != null) {
                viewDataBinding.m396c();
            }
        }

        private OnStartListener(ViewDataBinding viewDataBinding) {
            this.f735f = new WeakReference<>(viewDataBinding);
        }
    }

    /* JADX INFO: renamed from: androidx.databinding.ViewDataBinding$a */
    public static class C0111a implements InterfaceC0116f {
    }

    /* JADX INFO: renamed from: androidx.databinding.ViewDataBinding$b */
    public static class C0112b implements InterfaceC0116f {
        @Override // androidx.databinding.ViewDataBinding.InterfaceC0116f
        /* JADX INFO: renamed from: a */
        public C0120j mo405a(ViewDataBinding viewDataBinding, int i) {
            return new C0118h(viewDataBinding, i).f740a;
        }
    }

    /* JADX INFO: renamed from: androidx.databinding.ViewDataBinding$c */
    public static class C0113c extends CallbackRegistry.a<OnRebindCallback, ViewDataBinding, Void> {
        @Override // p636z0.p748n.CallbackRegistry.a
        /* JADX INFO: renamed from: a */
        public void mo406a(OnRebindCallback onRebindCallback, ViewDataBinding viewDataBinding, int i, Void r4) {
            OnRebindCallback onRebindCallback2 = onRebindCallback;
            if (i == 1) {
                Objects.requireNonNull(onRebindCallback2);
            } else if (i == 2) {
                Objects.requireNonNull(onRebindCallback2);
            } else {
                if (i != 3) {
                    return;
                }
                Objects.requireNonNull(onRebindCallback2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.databinding.ViewDataBinding$d */
    public static class ViewOnAttachStateChangeListenerC0114d implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        @TargetApi(19)
        public void onViewAttachedToWindow(View view) {
            (view != null ? (ViewDataBinding) view.getTag(R.id.dataBinding) : null).f722g.run();
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: renamed from: androidx.databinding.ViewDataBinding$e */
    public class RunnableC0115e implements Runnable {
        public RunnableC0115e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                ViewDataBinding.this.f723h = false;
            }
            while (true) {
                Reference<? extends ViewDataBinding> referencePoll = ViewDataBinding.f720e.poll();
                if (referencePoll == null) {
                    break;
                } else if (referencePoll instanceof C0120j) {
                    ((C0120j) referencePoll).m411a();
                }
            }
            if (ViewDataBinding.this.f726k.isAttachedToWindow()) {
                ViewDataBinding.this.m396c();
                return;
            }
            View view = ViewDataBinding.this.f726k;
            View.OnAttachStateChangeListener onAttachStateChangeListener = ViewDataBinding.f721f;
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            ViewDataBinding.this.f726k.addOnAttachStateChangeListener(onAttachStateChangeListener);
        }
    }

    /* JADX INFO: renamed from: androidx.databinding.ViewDataBinding$f */
    public interface InterfaceC0116f {
        /* JADX INFO: renamed from: a */
        C0120j mo405a(ViewDataBinding viewDataBinding, int i);
    }

    /* JADX INFO: renamed from: androidx.databinding.ViewDataBinding$g */
    public static class C0117g {

        /* JADX INFO: renamed from: a */
        public final String[][] f737a;

        /* JADX INFO: renamed from: b */
        public final int[][] f738b;

        /* JADX INFO: renamed from: c */
        public final int[][] f739c;

        public C0117g(int i) {
            this.f737a = new String[i][];
            this.f738b = new int[i][];
            this.f739c = new int[i][];
        }
    }

    /* JADX INFO: renamed from: androidx.databinding.ViewDataBinding$h */
    public static class C0118h implements Observer, InterfaceC0119i<LiveData<?>> {

        /* JADX INFO: renamed from: a */
        public final C0120j<LiveData<?>> f740a;

        /* JADX INFO: renamed from: b */
        public LifecycleOwner f741b;

        public C0118h(ViewDataBinding viewDataBinding, int i) {
            this.f740a = new C0120j<>(viewDataBinding, i, this);
        }

        @Override // androidx.databinding.ViewDataBinding.InterfaceC0119i
        /* JADX INFO: renamed from: a */
        public void mo407a(LifecycleOwner lifecycleOwner) {
            LiveData<?> liveData = this.f740a.f744c;
            if (liveData != null) {
                if (this.f741b != null) {
                    liveData.mo426i(this);
                }
                if (lifecycleOwner != null) {
                    liveData.mo422e(lifecycleOwner, this);
                }
            }
            this.f741b = lifecycleOwner;
        }

        @Override // androidx.databinding.ViewDataBinding.InterfaceC0119i
        /* JADX INFO: renamed from: b */
        public void mo408b(LiveData<?> liveData) {
            liveData.mo426i(this);
        }

        @Override // androidx.databinding.ViewDataBinding.InterfaceC0119i
        /* JADX INFO: renamed from: c */
        public void mo409c(LiveData<?> liveData) {
            LiveData<?> liveData2 = liveData;
            LifecycleOwner lifecycleOwner = this.f741b;
            if (lifecycleOwner != null) {
                liveData2.mo422e(lifecycleOwner, this);
            }
        }

        @Override // p636z0.p759s.Observer
        /* JADX INFO: renamed from: d */
        public void mo410d(Object obj) {
            C0120j<LiveData<?>> c0120j = this.f740a;
            ViewDataBinding viewDataBinding = (ViewDataBinding) c0120j.get();
            if (viewDataBinding == null) {
                c0120j.m411a();
            }
            if (viewDataBinding != null) {
                C0120j<LiveData<?>> c0120j2 = this.f740a;
                int i = c0120j2.f743b;
                LiveData<?> liveData = c0120j2.f744c;
                if (!viewDataBinding.f734s && viewDataBinding.mo399j(i, liveData, 0)) {
                    viewDataBinding.m401m();
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.databinding.ViewDataBinding$i */
    public interface InterfaceC0119i<T> {
        /* JADX INFO: renamed from: a */
        void mo407a(LifecycleOwner lifecycleOwner);

        /* JADX INFO: renamed from: b */
        void mo408b(T t);

        /* JADX INFO: renamed from: c */
        void mo409c(T t);
    }

    /* JADX INFO: renamed from: androidx.databinding.ViewDataBinding$j */
    public static class C0120j<T> extends WeakReference<ViewDataBinding> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC0119i<T> f742a;

        /* JADX INFO: renamed from: b */
        public final int f743b;

        /* JADX INFO: renamed from: c */
        public T f744c;

        public C0120j(ViewDataBinding viewDataBinding, int i, InterfaceC0119i<T> interfaceC0119i) {
            super(viewDataBinding, ViewDataBinding.f720e);
            this.f743b = i;
            this.f742a = interfaceC0119i;
        }

        /* JADX INFO: renamed from: a */
        public boolean m411a() {
            boolean z;
            T t = this.f744c;
            if (t != null) {
                this.f742a.mo408b(t);
                z = true;
            } else {
                z = false;
            }
            this.f744c = null;
            return z;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f717b = i;
        f718c = i >= 16;
        f719d = new C0112b();
        new C0113c();
        f720e = new ReferenceQueue<>();
        f721f = new ViewOnAttachStateChangeListenerC0114d();
    }

    public ViewDataBinding(Object obj, View view, int i) {
        DataBindingComponent dataBindingComponent;
        if (obj == null) {
            dataBindingComponent = null;
        } else {
            if (!(obj instanceof DataBindingComponent)) {
                throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
            }
            dataBindingComponent = (DataBindingComponent) obj;
        }
        this.f722g = new RunnableC0115e();
        this.f723h = false;
        this.f724i = false;
        this.f731p = dataBindingComponent;
        this.f725j = new C0120j[i];
        this.f726k = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        if (f718c) {
            this.f728m = Choreographer.getInstance();
            this.f729n = new ViewDataBinding2(this);
        } else {
            this.f729n = null;
            this.f730o = new Handler(Looper.myLooper());
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m388d(View view, int i) {
        return Build.VERSION.SDK_INT >= 23 ? view.getContext().getColor(i) : view.getResources().getColor(i);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m389g(String str, int i) {
        int length = str.length();
        if (length == i) {
            return false;
        }
        while (i < length) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:97:0x0194  */
    /* JADX INFO: renamed from: h */
    public static void m390h(DataBindingComponent dataBindingComponent, View view, Object[] objArr, C0117g c0117g, SparseIntArray sparseIntArray, boolean z) {
        boolean z2;
        int i;
        String str;
        int i2;
        int i3;
        boolean z3;
        int id;
        int i4;
        int iM392k;
        C0117g c0117g2 = c0117g;
        if ((view != null ? (ViewDataBinding) view.getTag(R.id.dataBinding) : null) != null) {
            return;
        }
        Object tag = view.getTag();
        String str2 = tag instanceof String ? (String) tag : null;
        String str3 = "layout";
        int i5 = -1;
        int i6 = 1;
        if (z && str2 != null && str2.startsWith("layout")) {
            int iLastIndexOf = str2.lastIndexOf(95);
            if (iLastIndexOf > 0) {
                int i7 = iLastIndexOf + 1;
                if (m389g(str2, i7)) {
                    iM392k = m392k(str2, i7);
                    if (objArr[iM392k] == null) {
                        objArr[iM392k] = view;
                    }
                    if (c0117g2 == null) {
                        iM392k = -1;
                    }
                    z2 = true;
                } else {
                    iM392k = -1;
                    z2 = false;
                }
            } else {
                iM392k = -1;
                z2 = false;
            }
            i = iM392k;
        } else if (str2 == null || !str2.startsWith("binding_")) {
            z2 = false;
            i = -1;
        } else {
            int iM392k2 = m392k(str2, 8);
            if (objArr[iM392k2] == null) {
                objArr[iM392k2] = view;
            }
            if (c0117g2 == null) {
                iM392k2 = -1;
            }
            i = iM392k2;
            z2 = true;
        }
        if (!z2 && (id = view.getId()) > 0 && sparseIntArray != null && (i4 = sparseIntArray.get(id, -1)) >= 0 && objArr[i4] == null) {
            objArr[i4] = view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            int i8 = 0;
            int i9 = 0;
            while (i8 < childCount) {
                View childAt = viewGroup.getChildAt(i8);
                if (i < 0 || !(childAt.getTag() instanceof String)) {
                    str = str3;
                    i2 = i8;
                    i3 = i9;
                    z3 = false;
                } else {
                    String str4 = (String) childAt.getTag();
                    if (str4.endsWith("_0") && str4.startsWith(str3) && str4.indexOf(47) > 0) {
                        CharSequence charSequenceSubSequence = str4.subSequence(str4.indexOf(47) + i6, str4.length() - 2);
                        String[] strArr = c0117g2.f737a[i];
                        int length = strArr.length;
                        int i10 = i9;
                        while (true) {
                            if (i10 >= length) {
                                i10 = -1;
                                break;
                            } else if (TextUtils.equals(charSequenceSubSequence, strArr[i10])) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                        if (i10 >= 0) {
                            int i11 = i10 + 1;
                            int i12 = c0117g2.f738b[i][i10];
                            int i13 = c0117g2.f739c[i][i10];
                            String str5 = (String) viewGroup.getChildAt(i8).getTag();
                            String strSubstring = str5.substring(0, str5.length() + i5);
                            int length2 = strSubstring.length();
                            int childCount2 = viewGroup.getChildCount();
                            int i14 = i8 + 1;
                            int i15 = i8;
                            while (true) {
                                if (i14 >= childCount2) {
                                    str = str3;
                                    break;
                                }
                                View childAt2 = viewGroup.getChildAt(i14);
                                String str6 = childAt2.getTag() instanceof String ? (String) childAt2.getTag() : null;
                                if (str6 != null && str6.startsWith(strSubstring)) {
                                    str = str3;
                                    if (str6.length() == str5.length() && str6.charAt(str6.length() - 1) == '0') {
                                        break;
                                    } else if (m389g(str6, length2)) {
                                        i15 = i14;
                                    }
                                } else {
                                    str = str3;
                                }
                                i14++;
                                str3 = str;
                            }
                            if (i15 == i8) {
                                objArr[i12] = DataBindingUtil.m16402a(dataBindingComponent, childAt, i13);
                            } else {
                                int i16 = (i15 - i8) + 1;
                                View[] viewArr = new View[i16];
                                for (int i17 = 0; i17 < i16; i17++) {
                                    viewArr[i17] = viewGroup.getChildAt(i8 + i17);
                                }
                                objArr[i12] = DataBindingUtil.f38199a.mo385c(dataBindingComponent, viewArr, i13);
                                i8 += i16 - 1;
                            }
                            i3 = i11;
                            i2 = i8;
                            z3 = true;
                        } else {
                            str = str3;
                            i2 = i8;
                            i3 = i9;
                            z3 = false;
                        }
                    } else {
                        str = str3;
                        i2 = i8;
                        i3 = i9;
                        z3 = false;
                    }
                }
                if (!z3) {
                    m390h(dataBindingComponent, childAt, objArr, c0117g, sparseIntArray, false);
                }
                int i18 = i2 + 1;
                c0117g2 = c0117g;
                i8 = i18;
                i9 = i3;
                childCount = childCount;
                str3 = str;
                i5 = -1;
                i6 = 1;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static Object[] m391i(DataBindingComponent dataBindingComponent, View view, int i, C0117g c0117g, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        m390h(dataBindingComponent, view, objArr, null, sparseIntArray, true);
        return objArr;
    }

    /* JADX INFO: renamed from: k */
    public static int m392k(String str, int i) {
        int length = str.length();
        int iCharAt = 0;
        while (i < length) {
            iCharAt = (iCharAt * 10) + (str.charAt(i) - '0');
            i++;
        }
        return iCharAt;
    }

    /* JADX INFO: renamed from: n */
    public static int m393n(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: o */
    public static boolean m394o(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo395b();

    /* JADX INFO: renamed from: c */
    public void m396c() {
        if (this.f727l) {
            m401m();
        } else if (mo397e()) {
            this.f727l = true;
            this.f724i = false;
            mo395b();
            this.f727l = false;
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo397e();

    /* JADX INFO: renamed from: f */
    public abstract void mo398f();

    /* JADX INFO: renamed from: j */
    public abstract boolean mo399j(int i, Object obj, int i2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: l */
    public void m400l(int i, Object obj, InterfaceC0116f interfaceC0116f) {
        C0120j c0120jMo405a = this.f725j[i];
        if (c0120jMo405a == null) {
            c0120jMo405a = interfaceC0116f.mo405a(this, i);
            this.f725j[i] = c0120jMo405a;
            LifecycleOwner lifecycleOwner = this.f732q;
            if (lifecycleOwner != null) {
                c0120jMo405a.f742a.mo407a(lifecycleOwner);
            }
        }
        c0120jMo405a.m411a();
        c0120jMo405a.f744c = obj;
        c0120jMo405a.f742a.mo409c(obj);
    }

    /* JADX INFO: renamed from: m */
    public void m401m() {
        LifecycleOwner lifecycleOwner = this.f732q;
        if (lifecycleOwner == null || lifecycleOwner.mo124b().mo16728b().isAtLeast(Lifecycle3.b.STARTED)) {
            synchronized (this) {
                if (this.f723h) {
                    return;
                }
                this.f723h = true;
                if (f718c) {
                    this.f728m.postFrameCallback(this.f729n);
                } else {
                    this.f730o.post(this.f722g);
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void m402p(LifecycleOwner lifecycleOwner) {
        LifecycleOwner lifecycleOwner2 = this.f732q;
        if (lifecycleOwner2 == lifecycleOwner) {
            return;
        }
        if (lifecycleOwner2 != null) {
            lifecycleOwner2.mo124b().mo16729c(this.f733r);
        }
        this.f732q = lifecycleOwner;
        if (lifecycleOwner != null) {
            if (this.f733r == null) {
                this.f733r = new OnStartListener(this, null);
            }
            lifecycleOwner.mo124b().mo16727a(this.f733r);
        }
        for (C0120j c0120j : this.f725j) {
            if (c0120j != null) {
                c0120j.f742a.mo407a(lifecycleOwner);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public abstract boolean mo403q(int i, Object obj);

    /* JADX WARN: Code duplicated, block: B:13:0x0021  */
    /* JADX INFO: renamed from: r */
    public boolean m404r(int i, LiveData<?> liveData) {
        boolean zM411a = true;
        this.f734s = true;
        try {
            InterfaceC0116f interfaceC0116f = f719d;
            if (liveData == null) {
                C0120j c0120j = this.f725j[i];
                if (c0120j != null) {
                    zM411a = c0120j.m411a();
                } else {
                    zM411a = false;
                }
            } else {
                C0120j[] c0120jArr = this.f725j;
                C0120j c0120j2 = c0120jArr[i];
                if (c0120j2 == null) {
                    m400l(i, liveData, interfaceC0116f);
                } else if (c0120j2.f744c == liveData) {
                    zM411a = false;
                } else {
                    C0120j c0120j3 = c0120jArr[i];
                    if (c0120j3 != null) {
                        c0120j3.m411a();
                    }
                    m400l(i, liveData, interfaceC0116f);
                }
            }
            return zM411a;
        } finally {
            this.f734s = false;
        }
    }
}
