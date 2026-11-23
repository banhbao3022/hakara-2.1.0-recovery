package p555j.p556a.p557a.p558a.p592b;

import androidx.lifecycle.ViewModel;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Objects;
import kotlinx.coroutines.CoroutineExceptionHandler;
import mtp.media.karaoke.data.remote.response.ServerErrorResponse;
import p007c.p190n.p430e.Gson6;
import p007c.p451o.p452a.C5729a;
import p477d1.Lazy3;
import p477d1.LazyJVM;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p500e1.p501a.CoroutineDispatcher;
import p500e1.p501a.CoroutineScope;
import p500e1.p501a.Dispatchers;
import p500e1.p501a.p503c2.MainDispatchers;
import p500e1.p501a.p503c2.Scopes;
import p509g1.ResponseBody;
import p555j.p556a.p557a.p606h.p613d.ErrorHandlingFactory;
import p555j.p556a.p557a.p606h.p613d.ErrorHandlingFactory2;
import p555j.p556a.p557a.p619l.SingleLiveEvent;
import p623k1.HttpException2;
import p623k1.Response4;
import p636z0.p752p.C8310a;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.a.b.a, reason: use source file name */
/* JADX INFO: compiled from: BaseViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseViewModel extends ViewModel {

    /* JADX INFO: renamed from: c */
    public final MutableLiveData<Boolean> f31989c;

    /* JADX INFO: renamed from: d */
    public final Lazy3 f31990d;

    /* JADX INFO: renamed from: e */
    public final Lazy3 f31991e;

    /* JADX INFO: renamed from: f */
    public final Lazy3 f31992f;

    /* JADX INFO: renamed from: g */
    public final Lazy3 f31993g;

    /* JADX INFO: renamed from: h */
    public final Lazy3 f31994h;

    /* JADX INFO: renamed from: i */
    public final Lazy3 f31995i;

    /* JADX INFO: renamed from: j */
    public final Lazy3 f31996j;

    /* JADX INFO: renamed from: k */
    public final Lazy3 f31997k;

    /* JADX INFO: renamed from: j.a.a.a.b.a$a */
    /* JADX INFO: compiled from: kotlin-style lambda group */
    /* JADX INFO: loaded from: classes.dex */
    public static final class a extends Lambda implements InterfaceC6153a<SingleLiveEvent<Unit>> {

        /* JADX INFO: renamed from: g */
        public static final a f31998g = new a(0);

        /* JADX INFO: renamed from: h */
        public static final a f31999h = new a(1);

        /* JADX INFO: renamed from: i */
        public static final a f32000i = new a(2);

        /* JADX INFO: renamed from: j */
        public static final a f32001j = new a(3);

        /* JADX INFO: renamed from: k */
        public static final a f32002k = new a(4);

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ int f32003l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(0);
            this.f32003l = i;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public final SingleLiveEvent<Unit> mo2c() {
            int i = this.f32003l;
            if (i == 0) {
                return new SingleLiveEvent<>();
            }
            if (i == 1) {
                return new SingleLiveEvent<>();
            }
            if (i == 2) {
                return new SingleLiveEvent<>();
            }
            if (i == 3) {
                return new SingleLiveEvent<>();
            }
            if (i == 4) {
                return new SingleLiveEvent<>();
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.b.a$b */
    /* JADX INFO: compiled from: BaseViewModel.kt */
    public static final class b extends Lambda implements InterfaceC6153a<SingleLiveEvent<String>> {

        /* JADX INFO: renamed from: g */
        public static final b f32004g = new b();

        public b() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public SingleLiveEvent<String> mo2c() {
            return new SingleLiveEvent<>();
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.b.a$c */
    /* JADX INFO: compiled from: BaseViewModel.kt */
    public static final class c extends Lambda implements InterfaceC6153a<CoroutineExceptionHandler> {
        public c() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public CoroutineExceptionHandler mo2c() {
            int i = CoroutineExceptionHandler.f33299d;
            return new CoroutineExceptionHandler2(CoroutineExceptionHandler.C7217a.f33300f, this);
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.b.a$d */
    /* JADX INFO: compiled from: BaseViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.base.BaseViewModel$onError$2", m13069f = "BaseViewModel.kt", m13070l = {}, m13071m = "invokeSuspend")
    public static final class d extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ Throwable f32007k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Throwable th, Continuation continuation) {
            super(2, continuation);
            this.f32007k = th;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return BaseViewModel.this.new d(this.f32007k, continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            d dVar = BaseViewModel.this.new d(this.f32007k, continuation2);
            Unit unit = Unit.f29502a;
            dVar.mo6m(unit);
            return unit;
        }

        /* JADX WARN: Code duplicated, block: B:35:0x008b  */
        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            ErrorHandlingFactory errorHandlingFactory;
            String strString;
            ServerErrorResponse serverErrorResponse;
            ErrorHandlingFactory errorHandlingFactoryM14174a;
            C5729a.m12442O(obj);
            Throwable th = this.f32007k;
            if ((th instanceof UnknownHostException) || (th instanceof ConnectException)) {
                BaseViewModel.this.m13961j().mo427j(null);
            } else if (th instanceof SocketTimeoutException) {
                BaseViewModel.this.m13958g().mo427j(null);
            } else {
                Intrinsics2.m13089e(th, "$this$toBaseException");
                if (th instanceof ErrorHandlingFactory) {
                    errorHandlingFactoryM14174a = (ErrorHandlingFactory) th;
                } else {
                    if (th instanceof IOException) {
                        Objects.requireNonNull(ErrorHandlingFactory.f32359f);
                        Intrinsics2.m13089e(th, "cause");
                        errorHandlingFactory = new ErrorHandlingFactory(ErrorHandlingFactory2.NETWORK, null, null, 0, th, 14, null);
                    } else if (th instanceof HttpException2) {
                        HttpException2 httpException2 = (HttpException2) th;
                        Response4<?> response4 = httpException2.f33165g;
                        int i = httpException2.f33164f;
                        if ((response4 != null ? response4.f33294c : null) == null) {
                            ErrorHandlingFactory.f32359f.m14174a(response4, i);
                        }
                        if (response4 != null) {
                            try {
                                ResponseBody responseBody = response4.f33294c;
                                if (responseBody == null || (strString = responseBody.string()) == null) {
                                    strString = "";
                                }
                            } catch (Exception e) {
                                Intrinsics2.m13089e(e, "$this$safeLog");
                            }
                        } else {
                            strString = "";
                        }
                        try {
                            serverErrorResponse = (ServerErrorResponse) new Gson6().m12315b(strString, ServerErrorResponse.class);
                        } catch (Exception e2) {
                            Intrinsics2.m13089e(e2, "$this$safeLog");
                            serverErrorResponse = new ServerErrorResponse(null, null, 3, null);
                        }
                        ServerErrorResponse serverErrorResponse2 = serverErrorResponse;
                        if (serverErrorResponse2 != null) {
                            Objects.requireNonNull(ErrorHandlingFactory.f32359f);
                            Intrinsics2.m13089e(serverErrorResponse2, "serverErrorResponse");
                            errorHandlingFactoryM14174a = new ErrorHandlingFactory(ErrorHandlingFactory2.SERVER, serverErrorResponse2, response4, i, null, 16, null);
                        } else {
                            errorHandlingFactoryM14174a = ErrorHandlingFactory.f32359f.m14174a(response4, i);
                        }
                    } else {
                        Objects.requireNonNull(ErrorHandlingFactory.f32359f);
                        Intrinsics2.m13089e(th, "cause");
                        errorHandlingFactory = new ErrorHandlingFactory(ErrorHandlingFactory2.UNEXPECTED, null, null, 0, th, 14, null);
                    }
                    errorHandlingFactoryM14174a = errorHandlingFactory;
                }
                int i2 = errorHandlingFactoryM14174a.f32363j;
                if (i2 == 401 || i2 == 404 || i2 == 500) {
                    BaseViewModel.this.m13959h().mo427j(errorHandlingFactoryM14174a.getMessage());
                } else {
                    BaseViewModel.this.m13963l().mo427j(null);
                }
            }
            BaseViewModel.this.f31989c.mo427j(Boolean.FALSE);
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.b.a$e */
    /* JADX INFO: compiled from: BaseViewModel.kt */
    public static final class e extends Lambda implements InterfaceC6153a<CoroutineScope> {
        public e() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public CoroutineScope mo2c() {
            CoroutineScope coroutineScopeM16440e = C8310a.m16440e(BaseViewModel.this);
            return new Scopes(coroutineScopeM16440e.mo417h().plus((CoroutineExceptionHandler) BaseViewModel.this.f31996j.getValue()));
        }
    }

    public BaseViewModel() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.mo427j(Boolean.FALSE);
        this.f31989c = mutableLiveData;
        this.f31990d = LazyJVM.m13021b(b.f32004g);
        this.f31991e = LazyJVM.m13021b(a.f32000i);
        this.f31992f = LazyJVM.m13021b(a.f31998g);
        this.f31993g = LazyJVM.m13021b(a.f31999h);
        this.f31994h = LazyJVM.m13021b(a.f32001j);
        this.f31995i = LazyJVM.m13021b(a.f32002k);
        this.f31996j = LazyJVM.m13021b(new c());
        this.f31997k = LazyJVM.m13021b(new e());
    }

    /* JADX INFO: renamed from: g */
    public final SingleLiveEvent<Unit> m13958g() {
        return (SingleLiveEvent) this.f31992f.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final SingleLiveEvent<String> m13959h() {
        return (SingleLiveEvent) this.f31990d.getValue();
    }

    /* JADX INFO: renamed from: i */
    public final SingleLiveEvent<Unit> m13960i() {
        return (SingleLiveEvent) this.f31993g.getValue();
    }

    /* JADX INFO: renamed from: j */
    public final SingleLiveEvent<Unit> m13961j() {
        return (SingleLiveEvent) this.f31991e.getValue();
    }

    /* JADX INFO: renamed from: k */
    public final SingleLiveEvent<Unit> m13962k() {
        return (SingleLiveEvent) this.f31994h.getValue();
    }

    /* JADX INFO: renamed from: l */
    public final SingleLiveEvent<Unit> m13963l() {
        return (SingleLiveEvent) this.f31995i.getValue();
    }

    /* JADX INFO: renamed from: m */
    public Object mo13964m(Throwable th, Continuation<? super Unit> continuation) throws Throwable {
        CoroutineDispatcher coroutineDispatcher = Dispatchers.f29769a;
        Object objM12445R = C5729a.m12445R(MainDispatchers.f29666b, new d(th, null), continuation);
        return objM12445R == Intrinsics.COROUTINE_SUSPENDED ? objM12445R : Unit.f29502a;
    }

    /* JADX INFO: renamed from: n */
    public final void m13965n() {
        this.f31989c.mo427j(Boolean.TRUE);
    }
}
