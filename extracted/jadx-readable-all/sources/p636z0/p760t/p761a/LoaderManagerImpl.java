package p636z0.p760t.p761a;

import android.os.Bundle;
import androidx.lifecycle.ViewModel;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p691g.SparseArrayCompat;
import p636z0.p725k.C8162a;
import p636z0.p759s.LifecycleOwner;
import p636z0.p759s.MutableLiveData;
import p636z0.p759s.Observer;
import p636z0.p759s.ViewModelProvider2;
import p636z0.p759s.ViewModelStore;
import p636z0.p760t.p762b.Loader2;

/* JADX INFO: renamed from: z0.t.a.b, reason: use source file name */
/* JADX INFO: compiled from: LoaderManagerImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class LoaderManagerImpl extends LoaderManager {

    /* JADX INFO: renamed from: a */
    public final LifecycleOwner f38736a;

    /* JADX INFO: renamed from: b */
    public final c f38737b;

    /* JADX INFO: renamed from: z0.t.a.b$a */
    /* JADX INFO: compiled from: LoaderManagerImpl.java */
    public static class a<D> extends MutableLiveData<D> implements Loader2.a<D> {

        /* JADX INFO: renamed from: l */
        public final int f38738l;

        /* JADX INFO: renamed from: m */
        public final Bundle f38739m;

        /* JADX INFO: renamed from: n */
        public final Loader2<D> f38740n;

        /* JADX INFO: renamed from: o */
        public LifecycleOwner f38741o;

        /* JADX INFO: renamed from: p */
        public b<D> f38742p;

        /* JADX INFO: renamed from: q */
        public Loader2<D> f38743q;

        public a(int i, Bundle bundle, Loader2<D> loader2, Loader2<D> loader3) {
            this.f38738l = i;
            this.f38739m = bundle;
            this.f38740n = loader2;
            this.f38743q = loader3;
            if (loader2.f38757b != null) {
                throw new IllegalStateException("There is already a listener registered");
            }
            loader2.f38757b = this;
            loader2.f38756a = i;
        }

        @Override // androidx.lifecycle.LiveData
        /* JADX INFO: renamed from: g */
        public void mo424g() {
            Loader2<D> loader2 = this.f38740n;
            loader2.f38758c = true;
            loader2.f38760e = false;
            loader2.f38759d = false;
            loader2.mo4921c();
        }

        @Override // androidx.lifecycle.LiveData
        /* JADX INFO: renamed from: h */
        public void mo425h() {
            this.f38740n.f38758c = false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        /* JADX INFO: renamed from: i */
        public void mo426i(Observer<? super D> observer) {
            super.mo426i(observer);
            this.f38741o = null;
            this.f38742p = null;
        }

        @Override // p636z0.p759s.MutableLiveData, androidx.lifecycle.LiveData
        /* JADX INFO: renamed from: j */
        public void mo427j(D d) {
            super.mo427j(d);
            Loader2<D> loader2 = this.f38743q;
            if (loader2 != null) {
                loader2.f38760e = true;
                loader2.f38758c = false;
                loader2.f38759d = false;
                loader2.f38761f = false;
                this.f38743q = null;
            }
        }

        /* JADX INFO: renamed from: l */
        public Loader2<D> m16750l(boolean z) {
            this.f38740n.mo16754b();
            this.f38740n.f38759d = true;
            b<D> bVar = this.f38742p;
            if (bVar != null) {
                super.mo426i(bVar);
                this.f38741o = null;
                this.f38742p = null;
                if (z && bVar.f38746c) {
                    Objects.requireNonNull((SignInHubActivity.C5891a) bVar.f38745b);
                }
            }
            Loader2<D> loader2 = this.f38740n;
            Loader2.a<D> aVar = loader2.f38757b;
            if (aVar == null) {
                throw new IllegalStateException("No listener register");
            }
            if (aVar != this) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            loader2.f38757b = null;
            if ((bVar == null || bVar.f38746c) && !z) {
                return loader2;
            }
            loader2.f38760e = true;
            loader2.f38758c = false;
            loader2.f38759d = false;
            loader2.f38761f = false;
            return this.f38743q;
        }

        /* JADX INFO: renamed from: m */
        public void m16751m() {
            LifecycleOwner lifecycleOwner = this.f38741o;
            b<D> bVar = this.f38742p;
            if (lifecycleOwner == null || bVar == null) {
                return;
            }
            super.mo426i(bVar);
            mo422e(lifecycleOwner, bVar);
        }

        /* JADX INFO: renamed from: n */
        public Loader2<D> m16752n(LifecycleOwner lifecycleOwner, LoaderManager.a<D> aVar) {
            b<D> bVar = new b<>(this.f38740n, aVar);
            mo422e(lifecycleOwner, bVar);
            b<D> bVar2 = this.f38742p;
            if (bVar2 != null) {
                mo426i(bVar2);
            }
            this.f38741o = lifecycleOwner;
            this.f38742p = bVar;
            return this.f38740n;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f38738l);
            sb.append(" : ");
            C8162a.m16058c(this.f38740n, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: z0.t.a.b$b */
    /* JADX INFO: compiled from: LoaderManagerImpl.java */
    public static class b<D> implements Observer<D> {

        /* JADX INFO: renamed from: a */
        public final Loader2<D> f38744a;

        /* JADX INFO: renamed from: b */
        public final LoaderManager.a<D> f38745b;

        /* JADX INFO: renamed from: c */
        public boolean f38746c = false;

        public b(Loader2<D> loader2, LoaderManager.a<D> aVar) {
            this.f38744a = loader2;
            this.f38745b = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p636z0.p759s.Observer
        /* JADX INFO: renamed from: d */
        public void mo410d(D d) {
            SignInHubActivity.C5891a c5891a = (SignInHubActivity.C5891a) this.f38745b;
            Objects.requireNonNull(c5891a);
            SignInHubActivity signInHubActivity = SignInHubActivity.this;
            signInHubActivity.setResult(signInHubActivity.f28542x, signInHubActivity.f28543y);
            SignInHubActivity.this.finish();
            this.f38746c = true;
        }

        public String toString() {
            return this.f38745b.toString();
        }
    }

    /* JADX INFO: renamed from: z0.t.a.b$c */
    /* JADX INFO: compiled from: LoaderManagerImpl.java */
    public static class c extends ViewModel {

        /* JADX INFO: renamed from: c */
        public static final ViewModelProvider2.b f38747c = new a();

        /* JADX INFO: renamed from: d */
        public SparseArrayCompat<a> f38748d = new SparseArrayCompat<>();

        /* JADX INFO: renamed from: e */
        public boolean f38749e = false;

        /* JADX INFO: renamed from: z0.t.a.b$c$a */
        /* JADX INFO: compiled from: LoaderManagerImpl.java */
        public static class a implements ViewModelProvider2.b {
            @Override // p636z0.p759s.ViewModelProvider2.b
            /* JADX INFO: renamed from: a */
            public <T extends ViewModel> T mo13840a(Class<T> cls) {
                return new c();
            }
        }

        @Override // androidx.lifecycle.ViewModel
        /* JADX INFO: renamed from: e */
        public void mo438e() {
            int iM15620k = this.f38748d.m15620k();
            for (int i = 0; i < iM15620k; i++) {
                this.f38748d.m15621l(i).m16750l(true);
            }
            SparseArrayCompat<a> sparseArrayCompat = this.f38748d;
            int i2 = sparseArrayCompat.f36672j;
            Object[] objArr = sparseArrayCompat.f36671i;
            for (int i3 = 0; i3 < i2; i3++) {
                objArr[i3] = null;
            }
            sparseArrayCompat.f36672j = 0;
            sparseArrayCompat.f36669g = false;
        }
    }

    public LoaderManagerImpl(LifecycleOwner lifecycleOwner, ViewModelStore viewModelStore) {
        this.f38736a = lifecycleOwner;
        this.f38737b = (c) new ViewModelProvider2(viewModelStore, c.f38747c).m16722a(c.class);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p636z0.p760t.p761a.LoaderManager
    @Deprecated
    /* JADX INFO: renamed from: a */
    public void mo16749a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        c cVar = this.f38737b;
        if (cVar.f38748d.m15620k() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < cVar.f38748d.m15620k(); i++) {
                a aVarM15621l = cVar.f38748d.m15621l(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(cVar.f38748d.m15618i(i));
                printWriter.print(": ");
                printWriter.println(aVarM15621l.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(aVarM15621l.f38738l);
                printWriter.print(" mArgs=");
                printWriter.println(aVarM15621l.f38739m);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(aVarM15621l.f38740n);
                aVarM15621l.f38740n.mo16753a(outline.m1599u(str2, "  "), fileDescriptor, printWriter, strArr);
                if (aVarM15621l.f38742p != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(aVarM15621l.f38742p);
                    b<D> bVar = aVarM15621l.f38742p;
                    Objects.requireNonNull(bVar);
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(bVar.f38746c);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                Object obj = aVarM15621l.f38740n;
                D dM421d = aVarM15621l.m421d();
                Objects.requireNonNull(obj);
                StringBuilder sb = new StringBuilder(64);
                C8162a.m16058c(dM421d, sb);
                sb.append("}");
                printWriter.println(sb.toString());
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(aVarM15621l.f770d > 0);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C8162a.m16058c(this.f38736a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
