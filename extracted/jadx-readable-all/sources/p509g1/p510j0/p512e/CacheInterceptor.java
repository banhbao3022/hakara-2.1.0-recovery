package p509g1.p510j0.p512e;

import com.facebook.stetho.server.http.HttpHeaders;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p007c.p071d.p078c.p079a.outline;
import p477d1.TypeCastException;
import p477d1.p481d0.StringsJVM;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.Cache2;
import p509g1.CacheControl;
import p509g1.EventListener;
import p509g1.Headers2;
import p509g1.HttpUrl;
import p509g1.Interceptor;
import p509g1.Protocol;
import p509g1.Request3;
import p509g1.Response3;
import p509g1.ResponseBody;
import p509g1.p510j0.Util9;
import p509g1.p510j0.p514g.RealCall;
import p509g1.p510j0.p515h.HttpHeaders2;
import p509g1.p510j0.p515h.RealInterceptorChain;
import p509g1.p510j0.p515h.RealResponseBody;
import p524h1.RealBufferedSource;
import p524h1.Sink;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: g1.j0.e.a, reason: use source file name */
/* JADX INFO: compiled from: CacheInterceptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CacheInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a */
    public static final a f30079a = new a(null);

    /* JADX INFO: renamed from: b */
    public final Cache2 f30080b;

    /* JADX INFO: renamed from: g1.j0.e.a$a */
    /* JADX INFO: compiled from: CacheInterceptor.kt */
    public static final class a {
        public a() {
        }

        /* JADX INFO: renamed from: a */
        public static final Response3 m13388a(a aVar, Response3 response3) {
            Objects.requireNonNull(aVar);
            if ((response3 != null ? response3.f29996m : null) == null) {
                return response3;
            }
            Objects.requireNonNull(response3);
            Response3.a aVar2 = new Response3.a(response3);
            aVar2.f30009g = null;
            return aVar2.m13339a();
        }

        /* JADX INFO: renamed from: b */
        public final boolean m13389b(String str) {
            return StringsJVM.m12989f(HttpHeaders.CONTENT_LENGTH, str, true) || StringsJVM.m12989f("Content-Encoding", str, true) || StringsJVM.m12989f(HttpHeaders.CONTENT_TYPE, str, true);
        }

        /* JADX INFO: renamed from: c */
        public final boolean m13390c(String str) {
            return (StringsJVM.m12989f("Connection", str, true) || StringsJVM.m12989f("Keep-Alive", str, true) || StringsJVM.m12989f("Proxy-Authenticate", str, true) || StringsJVM.m12989f("Proxy-Authorization", str, true) || StringsJVM.m12989f("TE", str, true) || StringsJVM.m12989f("Trailers", str, true) || StringsJVM.m12989f("Transfer-Encoding", str, true) || StringsJVM.m12989f("Upgrade", str, true)) ? false : true;
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public CacheInterceptor(Cache2 cache2) {
        this.f30080b = cache2;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x027b  */
    /* JADX WARN: Code duplicated, block: B:145:0x031b  */
    /* JADX WARN: Code duplicated, block: B:147:0x031f  */
    /* JADX WARN: Code duplicated, block: B:148:0x0321  */
    /* JADX WARN: Code duplicated, block: B:150:0x0325  */
    /* JADX WARN: Code duplicated, block: B:152:0x032a  */
    /* JADX WARN: Code duplicated, block: B:154:0x032e  */
    /* JADX WARN: Code duplicated, block: B:157:0x033b  */
    /* JADX WARN: Code duplicated, block: B:159:0x035c  */
    /* JADX WARN: Code duplicated, block: B:161:0x0361  */
    /* JADX WARN: Code duplicated, block: B:164:0x036f  */
    /* JADX WARN: Code duplicated, block: B:173:0x0396  */
    /* JADX WARN: Code duplicated, block: B:176:0x03a6 A[Catch: all -> 0x03b9, TryCatch #15 {, blocks: (B:174:0x0397, B:176:0x03a6, B:177:0x03ad, B:179:0x03b1), top: B:385:0x0397 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x03ad A[Catch: all -> 0x03b9, TryCatch #15 {, blocks: (B:174:0x0397, B:176:0x03a6, B:177:0x03ad, B:179:0x03b1), top: B:385:0x0397 }] */
    /* JADX WARN: Code duplicated, block: B:179:0x03b1 A[Catch: all -> 0x03b9, TRY_LEAVE, TryCatch #15 {, blocks: (B:174:0x0397, B:176:0x03a6, B:177:0x03ad, B:179:0x03b1), top: B:385:0x0397 }] */
    /* JADX WARN: Code duplicated, block: B:187:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:188:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:193:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:210:0x0425 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:211:0x0427  */
    /* JADX WARN: Code duplicated, block: B:213:0x0447  */
    /* JADX WARN: Code duplicated, block: B:215:0x044c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:216:0x044e  */
    /* JADX WARN: Code duplicated, block: B:217:0x045c  */
    /* JADX WARN: Code duplicated, block: B:219:0x0460  */
    /* JADX WARN: Code duplicated, block: B:222:0x0472  */
    /* JADX WARN: Code duplicated, block: B:224:0x0478  */
    /* JADX WARN: Code duplicated, block: B:226:0x0492  */
    /* JADX WARN: Code duplicated, block: B:228:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:231:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:238:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:242:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:250:0x0518  */
    /* JADX WARN: Code duplicated, block: B:252:0x051f  */
    /* JADX WARN: Code duplicated, block: B:257:0x053f  */
    /* JADX WARN: Code duplicated, block: B:268:0x056c  */
    /* JADX WARN: Code duplicated, block: B:273:0x0577  */
    /* JADX WARN: Code duplicated, block: B:275:0x057c  */
    /* JADX WARN: Code duplicated, block: B:277:0x0581  */
    /* JADX WARN: Code duplicated, block: B:279:0x0586  */
    /* JADX WARN: Code duplicated, block: B:286:0x0596  */
    /* JADX WARN: Code duplicated, block: B:289:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:30:0x014d  */
    /* JADX WARN: Code duplicated, block: B:322:0x0658  */
    /* JADX WARN: Code duplicated, block: B:325:0x065c  */
    /* JADX WARN: Code duplicated, block: B:327:0x0662  */
    /* JADX WARN: Code duplicated, block: B:329:0x0699  */
    /* JADX WARN: Code duplicated, block: B:331:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:345:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:374:0x054f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:381:0x0520 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x06dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:0x0397 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:404:0x04c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x016a  */
    /* JADX WARN: Type inference failed for: r2v34, types: [g1.c0, g1.f0] */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r2v67 */
    @Override // p509g1.Interceptor
    public Response3 intercept(Interceptor.a aVar) throws IOException {
        Response3 response3M13339a;
        boolean z;
        CacheStrategy cacheStrategy;
        CacheStrategy cacheStrategy2;
        String string;
        long time;
        String str;
        String str2;
        Headers2.a aVarM13651h;
        int i;
        ?? r2;
        Request3 request3;
        Response3 response3;
        Cache2 cache2;
        RealCall realCall;
        RealCall realCall2;
        EventListener eventListener;
        ResponseBody responseBody;
        Response3 response3Mo13492a;
        boolean z2;
        Response3 response3M13339a2;
        String str3;
        boolean z3;
        Cache2.d dVar;
        Sink sink;
        ResponseBody responseBody2;
        DiskLruCache2.b bVarM13402f;
        ResponseBody responseBody3;
        a aVar2;
        Headers2 headers2;
        Headers2 headers3;
        Headers2.a aVar3;
        int size;
        int i2;
        int i3;
        int size2;
        Response3 response3M13339a3;
        ResponseBody responseBody4;
        Cache2 cache3;
        Cache2.c cVar;
        ResponseBody responseBody5;
        DiskLruCache2.b bVarM13402f2;
        String strM13650f;
        String strM13650f2;
        String strM13653m;
        Headers2 headers4;
        ResponseBody responseBody6;
        boolean z4;
        boolean z5;
        Intrinsics2.m13090f(aVar, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) aVar;
        RealCall realCall3 = realInterceptorChain.f30288b;
        Cache2 cache4 = this.f30080b;
        if (cache4 != null) {
            Request3 request4 = realInterceptorChain.f30292f;
            Intrinsics2.m13090f(request4, "request");
            Cache2.b bVar = Cache2.f29919f;
            try {
                DiskLruCache2.d dVarM13405h = cache4.f29920g.m13405h(bVar.m13304a(request4.f29951b));
                if (dVarM13405h != null) {
                    try {
                        Cache2.c cVar2 = new Cache2.c(dVarM13405h.f30149h.get(0));
                        Intrinsics2.m13090f(dVarM13405h, "snapshot");
                        String strM13649c = cVar2.f29940i.m13649c(HttpHeaders.CONTENT_TYPE);
                        String strM13649c2 = cVar2.f29940i.m13649c(HttpHeaders.CONTENT_LENGTH);
                        Request3.a aVar4 = new Request3.a();
                        String string2 = cVar2.f29934c;
                        Intrinsics2.m13090f(string2, "url");
                        if (StringsJVM.m12995l(string2, "ws:", true)) {
                            StringBuilder sbM1556G = outline.m1556G("http:");
                            String strSubstring = string2.substring(3);
                            Intrinsics2.m13086b(strSubstring, "(this as java.lang.String).substring(startIndex)");
                            sbM1556G.append(strSubstring);
                            string2 = sbM1556G.toString();
                        } else if (StringsJVM.m12995l(string2, "wss:", true)) {
                            StringBuilder sbM1556G2 = outline.m1556G("https:");
                            String strSubstring2 = string2.substring(4);
                            Intrinsics2.m13086b(strSubstring2, "(this as java.lang.String).substring(startIndex)");
                            sbM1556G2.append(strSubstring2);
                            string2 = sbM1556G2.toString();
                        }
                        aVar4.m13321i(HttpUrl.f30642b.m13681c(string2));
                        aVar4.m13318f(cVar2.f29936e, null);
                        aVar4.m13317e(cVar2.f29935d);
                        Request3 request3M13314b = aVar4.m13314b();
                        Response3.a aVar5 = new Response3.a();
                        aVar5.m13345g(request3M13314b);
                        aVar5.m13344f(cVar2.f29937f);
                        aVar5.f30005c = cVar2.f29938g;
                        aVar5.m13343e(cVar2.f29939h);
                        aVar5.m13342d(cVar2.f29940i);
                        aVar5.f30009g = new Cache2.a(dVarM13405h, strM13649c, strM13649c2);
                        aVar5.f30007e = cVar2.f29941j;
                        aVar5.f30013k = cVar2.f29942k;
                        aVar5.f30014l = cVar2.f29943l;
                        response3M13339a = aVar5.m13339a();
                        Intrinsics2.m13090f(request4, "request");
                        Intrinsics2.m13090f(response3M13339a, "response");
                        if (Intrinsics2.m13085a(cVar2.f29934c, request4.f29951b.f30652l) && Intrinsics2.m13085a(cVar2.f29936e, request4.f29952c)) {
                            Headers2 headers5 = cVar2.f29935d;
                            Intrinsics2.m13090f(response3M13339a, "cachedResponse");
                            Intrinsics2.m13090f(headers5, "cachedRequest");
                            Intrinsics2.m13090f(request4, "newRequest");
                            Set<String> setM13306c = bVar.m13306c(response3M13339a.f29995l);
                            if (setM13306c.isEmpty()) {
                                z5 = true;
                                break;
                            }
                            Iterator<T> it = setM13306c.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z5 = true;
                                    break;
                                }
                                String str4 = (String) it.next();
                                List<String> listM13654q = headers5.m13654q(str4);
                                Intrinsics2.m13090f(str4, "name");
                                if (!Intrinsics2.m13085a(listM13654q, request4.f29953d.m13654q(str4))) {
                                    z5 = false;
                                    break;
                                }
                            }
                            if (z5) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                        } else {
                            z4 = false;
                        }
                        if (!z4) {
                            ResponseBody responseBody7 = response3M13339a.f29996m;
                            if (responseBody7 != null) {
                                Intrinsics2.m13090f(responseBody7, "$this$closeQuietly");
                                try {
                                    responseBody7.close();
                                } catch (RuntimeException e) {
                                    throw e;
                                }
                            }
                            response3M13339a = null;
                        }
                    } catch (IOException unused) {
                        byte[] bArr = Util9.f30070a;
                        Intrinsics2.m13090f(dVarM13405h, "$this$closeQuietly");
                        try {
                            dVarM13405h.close();
                        } catch (RuntimeException e2) {
                            throw e2;
                        }
                    }
                } else {
                    response3M13339a = null;
                }
            } catch (IOException | Exception unused2) {
            }
        } else {
            response3M13339a = null;
        }
        Response3 response4 = response3M13339a;
        CacheStrategy.b bVar2 = new CacheStrategy.b(System.currentTimeMillis(), realInterceptorChain.f30292f, response4);
        Response3 response5 = bVar2.f30099l;
        if (response5 != null) {
            Request3 request5 = bVar2.f30098k;
            if (!(request5.f29951b.f30643c && response5.f29994k == null) && CacheStrategy.f30085a.m13393a(response5, request5)) {
                CacheControl cacheControlM13311a = bVar2.f30098k.m13311a();
                if (cacheControlM13311a.f29962b) {
                    realInterceptorChain = realInterceptorChain;
                    realCall3 = realCall3;
                    z = false;
                    cacheStrategy = new CacheStrategy(bVar2.f30098k, null);
                } else {
                    Request3 request6 = bVar2.f30098k;
                    if ((request6.m13312b("If-Modified-Since") == null && request6.m13312b("If-None-Match") == null) ? false : true) {
                        realInterceptorChain = realInterceptorChain;
                        realCall3 = realCall3;
                        z = false;
                        cacheStrategy = new CacheStrategy(bVar2.f30098k, null);
                    } else {
                        CacheControl cacheControlM13337a = bVar2.f30099l.m13337a();
                        Date date = bVar2.f30088a;
                        long jMax = date != null ? Math.max(0L, bVar2.f30094g - date.getTime()) : 0L;
                        int i4 = bVar2.f30096i;
                        if (i4 != -1) {
                            jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i4));
                        }
                        long j2 = bVar2.f30094g;
                        long j3 = jMax + (j2 - bVar2.f30093f) + (bVar2.f30097j - j2);
                        Response3 response6 = bVar2.f30099l;
                        if (response6 == null) {
                            Intrinsics2.m13095k();
                            throw null;
                        }
                        int i5 = response6.m13337a().f29964d;
                        if (i5 != -1) {
                            time = TimeUnit.SECONDS.toMillis(i5);
                        } else {
                            Date date2 = bVar2.f30092e;
                            if (date2 != null) {
                                Date date3 = bVar2.f30088a;
                                time = date2.getTime() - (date3 != null ? date3.getTime() : bVar2.f30094g);
                                if (time <= 0) {
                                    time = 0;
                                }
                            } else if (bVar2.f30090c != null) {
                                HttpUrl httpUrl = bVar2.f30099l.f29990g.f29951b;
                                if (httpUrl.f30650j == null) {
                                    string = null;
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    HttpUrl.f30642b.m13684g(httpUrl.f30650j, sb);
                                    string = sb.toString();
                                }
                                if (string != null) {
                                    time = 0;
                                } else {
                                    Date date4 = bVar2.f30088a;
                                    long time2 = date4 != null ? date4.getTime() : bVar2.f30093f;
                                    Date date5 = bVar2.f30090c;
                                    if (date5 == null) {
                                        Intrinsics2.m13095k();
                                        throw null;
                                    }
                                    long time3 = time2 - date5.getTime();
                                    if (time3 > 0) {
                                        time = time3 / ((long) 10);
                                    } else {
                                        time = 0;
                                    }
                                }
                            } else {
                                time = 0;
                            }
                        }
                        int i6 = cacheControlM13311a.f29964d;
                        if (i6 != -1) {
                            time = Math.min(time, TimeUnit.SECONDS.toMillis(i6));
                        }
                        int i7 = cacheControlM13311a.f29970j;
                        long millis = i7 != -1 ? TimeUnit.SECONDS.toMillis(i7) : 0L;
                        long millis2 = (cacheControlM13337a.f29968h || (i = cacheControlM13311a.f29969i) == -1) ? 0L : TimeUnit.SECONDS.toMillis(i);
                        if (cacheControlM13337a.f29962b) {
                            str = bVar2.f30095h;
                            if (str != null) {
                                str2 = "If-None-Match";
                            } else {
                                if (bVar2.f30090c != null) {
                                    str = bVar2.f30091d;
                                } else if (bVar2.f30088a != null) {
                                    str = bVar2.f30089b;
                                } else {
                                    z = false;
                                    cacheStrategy = new CacheStrategy(bVar2.f30098k, null);
                                }
                                str2 = "If-Modified-Since";
                            }
                            aVarM13651h = bVar2.f30098k.f29953d.m13651h();
                            if (str != null) {
                                Intrinsics2.m13095k();
                                throw null;
                            }
                            aVarM13651h.m13657c(str2, str);
                            Request3 request7 = bVar2.f30098k;
                            Objects.requireNonNull(request7);
                            Request3.a aVar6 = new Request3.a(request7);
                            aVar6.m13317e(aVarM13651h.m13658d());
                            cacheStrategy2 = new CacheStrategy(aVar6.m13314b(), bVar2.f30099l);
                            r2 = 0;
                        } else {
                            long j4 = millis + j3;
                            if (j4 < millis2 + time) {
                                Response3 response7 = bVar2.f30099l;
                                Objects.requireNonNull(response7);
                                Response3.a aVar7 = new Response3.a(response7);
                                if (j4 >= time) {
                                    Intrinsics2.m13090f("Warning", "name");
                                    Intrinsics2.m13090f("110 HttpURLConnection \"Response is stale\"", "value");
                                    aVar7.f30008f.m13655a("Warning", "110 HttpURLConnection \"Response is stale\"");
                                }
                                if (j3 > 86400000) {
                                    Response3 response8 = bVar2.f30099l;
                                    if (response8 == null) {
                                        Intrinsics2.m13095k();
                                        throw null;
                                    }
                                    if (response8.m13337a().f29964d == -1 && bVar2.f30092e == null) {
                                        Intrinsics2.m13090f("Warning", "name");
                                        Intrinsics2.m13090f("113 HttpURLConnection \"Heuristic expiration\"", "value");
                                        aVar7.f30008f.m13655a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                    }
                                }
                                z = false;
                                cacheStrategy = new CacheStrategy(null, aVar7.m13339a());
                            } else {
                                str = bVar2.f30095h;
                                if (str != null) {
                                    str2 = "If-None-Match";
                                } else {
                                    if (bVar2.f30090c != null) {
                                        str = bVar2.f30091d;
                                    } else if (bVar2.f30088a != null) {
                                        str = bVar2.f30089b;
                                    } else {
                                        z = false;
                                        cacheStrategy = new CacheStrategy(bVar2.f30098k, null);
                                    }
                                    str2 = "If-Modified-Since";
                                }
                                aVarM13651h = bVar2.f30098k.f29953d.m13651h();
                                if (str != null) {
                                    Intrinsics2.m13095k();
                                    throw null;
                                }
                                aVarM13651h.m13657c(str2, str);
                                Request3 request8 = bVar2.f30098k;
                                Objects.requireNonNull(request8);
                                Request3.a aVar8 = new Request3.a(request8);
                                aVar8.m13317e(aVarM13651h.m13658d());
                                cacheStrategy2 = new CacheStrategy(aVar8.m13314b(), bVar2.f30099l);
                                r2 = 0;
                            }
                        }
                    }
                }
                cacheStrategy2 = cacheStrategy;
                r2 = z;
            } else {
                cacheStrategy2 = new CacheStrategy(bVar2.f30098k, null);
            }
            if (cacheStrategy2.f30086b != null && bVar2.f30098k.m13311a().f29971k) {
                cacheStrategy2 = new CacheStrategy(r2, r2);
            }
            request3 = cacheStrategy2.f30086b;
            response3 = cacheStrategy2.f30087c;
            cache2 = this.f30080b;
            if (cache2 != null) {
                synchronized (cache2) {
                    Intrinsics2.m13090f(cacheStrategy2, "cacheStrategy");
                    cache2.f29925l++;
                    if (cacheStrategy2.f30086b != null) {
                        cache2.f29923j++;
                    } else if (cacheStrategy2.f30087c != null) {
                        cache2.f29924k++;
                    }
                }
            }
            realCall = realCall3;
            if (realCall instanceof RealCall) {
                realCall2 = realCall;
            } else {
                realCall2 = null;
            }
            if (realCall2 != null || (eventListener = realCall2.f30214g) == null) {
                eventListener = EventListener.f30623a;
            }
            if (response4 != null && response3 == null && (responseBody6 = response4.f29996m) != null) {
                byte[] bArr2 = Util9.f30070a;
                Intrinsics2.m13090f(responseBody6, "$this$closeQuietly");
                try {
                    responseBody6.close();
                } catch (RuntimeException e3) {
                    throw e3;
                } catch (Exception unused3) {
                }
            }
            if (request3 != null && response3 == null) {
                Response3.a aVar9 = new Response3.a();
                aVar9.m13345g(realInterceptorChain.f30292f);
                aVar9.m13344f(Protocol.HTTP_1_1);
                aVar9.f30005c = 504;
                aVar9.m13343e("Unsatisfiable Request (only-if-cached)");
                aVar9.f30009g = Util9.f30072c;
                aVar9.f30013k = -1L;
                aVar9.f30014l = System.currentTimeMillis();
                Response3 response3M13339a4 = aVar9.m13339a();
                Objects.requireNonNull(eventListener);
                Intrinsics2.m13090f(realCall, "call");
                Intrinsics2.m13090f(response3M13339a4, "response");
                return response3M13339a4;
            }
            if (request3 == null) {
                if (response3 != null) {
                    Intrinsics2.m13095k();
                    throw null;
                }
                Response3.a aVar10 = new Response3.a(response3);
                aVar10.m13340b(a.m13388a(f30079a, response3));
                Response3 response3M13339a5 = aVar10.m13339a();
                Objects.requireNonNull(eventListener);
                Intrinsics2.m13090f(realCall, "call");
                Intrinsics2.m13090f(response3M13339a5, "response");
                return response3M13339a5;
            }
            if (response3 != null) {
                Objects.requireNonNull(eventListener);
                Intrinsics2.m13090f(realCall, "call");
                Intrinsics2.m13090f(response3, "cachedResponse");
            } else if (this.f30080b != null) {
                Objects.requireNonNull(eventListener);
                Intrinsics2.m13090f(realCall, "call");
            }
            try {
                response3Mo13492a = ((RealInterceptorChain) aVar).mo13492a(request3);
                if (response3 != null) {
                    z2 = false;
                } else {
                    if (response3Mo13492a.f29993j == 304) {
                        Response3.a aVar11 = new Response3.a(response3);
                        aVar2 = f30079a;
                        headers2 = response3.f29995l;
                        headers3 = response3Mo13492a.f29995l;
                        Objects.requireNonNull(aVar2);
                        aVar3 = new Headers2.a();
                        size = headers2.size();
                        i2 = 0;
                        while (i2 < size) {
                            strM13650f2 = headers2.m13650f(i2);
                            strM13653m = headers2.m13653m(i2);
                            if (StringsJVM.m12989f("Warning", strM13650f2, true)) {
                                headers4 = headers2;
                                if (StringsJVM.m12997n(strM13653m, "1", false, 2)) {
                                }
                                i2++;
                                headers2 = headers4;
                            } else {
                                headers4 = headers2;
                            }
                            if (aVar2.m13389b(strM13650f2) || !aVar2.m13390c(strM13650f2) || headers3.m13649c(strM13650f2) == null) {
                                aVar3.m13657c(strM13650f2, strM13653m);
                            }
                            i2++;
                            headers2 = headers4;
                        }
                        size2 = headers3.size();
                        for (i3 = 0; i3 < size2; i3++) {
                            strM13650f = headers3.m13650f(i3);
                            if (aVar2.m13389b(strM13650f) && aVar2.m13390c(strM13650f)) {
                                aVar3.m13657c(strM13650f, headers3.m13653m(i3));
                            }
                        }
                        aVar11.m13342d(aVar3.m13658d());
                        aVar11.f30013k = response3Mo13492a.f30000q;
                        aVar11.f30014l = response3Mo13492a.f30001r;
                        a aVar12 = f30079a;
                        aVar11.m13340b(a.m13388a(aVar12, response3));
                        Response3 response3M13388a = a.m13388a(aVar12, response3Mo13492a);
                        aVar11.m13341c("networkResponse", response3M13388a);
                        aVar11.f30010h = response3M13388a;
                        response3M13339a3 = aVar11.m13339a();
                        responseBody4 = response3Mo13492a.f29996m;
                        if (responseBody4 != null) {
                            Intrinsics2.m13095k();
                            throw null;
                        }
                        responseBody4.close();
                        cache3 = this.f30080b;
                        if (cache3 != null) {
                            Intrinsics2.m13095k();
                            throw null;
                        }
                        synchronized (cache3) {
                            cache3.f29924k++;
                        }
                        Objects.requireNonNull(this.f30080b);
                        Intrinsics2.m13090f(response3, "cached");
                        Intrinsics2.m13090f(response3M13339a3, "network");
                        cVar = new Cache2.c(response3M13339a3);
                        responseBody5 = response3.f29996m;
                        if (responseBody5 != null) {
                            throw new TypeCastException("null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
                        }
                        DiskLruCache2.d dVar2 = ((Cache2.a) responseBody5).f29927g;
                        try {
                            bVarM13402f2 = dVar2.f30150i.m13402f(dVar2.f30147f, dVar2.f30148g);
                            if (bVarM13402f2 != null) {
                                try {
                                    cVar.m13309c(bVarM13402f2);
                                    bVarM13402f2.m13409b();
                                } catch (IOException unused4) {
                                    if (bVarM13402f2 != null) {
                                        try {
                                            bVarM13402f2.m13408a();
                                        } catch (IOException unused5) {
                                        }
                                    }
                                }
                            }
                        } catch (IOException unused6) {
                            bVarM13402f2 = null;
                        }
                        Objects.requireNonNull(eventListener);
                        Intrinsics2.m13090f(realCall, "call");
                        Intrinsics2.m13090f(response3M13339a3, "response");
                        return response3M13339a3;
                    }
                    z2 = false;
                    responseBody3 = response3.f29996m;
                    if (responseBody3 != null) {
                        byte[] bArr3 = Util9.f30070a;
                        Intrinsics2.m13090f(responseBody3, "$this$closeQuietly");
                        try {
                            responseBody3.close();
                        } catch (RuntimeException e4) {
                            throw e4;
                        } catch (Exception unused7) {
                        }
                    }
                }
                Response3.a aVar13 = new Response3.a(response3Mo13492a);
                a aVar14 = f30079a;
                aVar13.m13340b(a.m13388a(aVar14, response3));
                Response3 response3M13388a2 = a.m13388a(aVar14, response3Mo13492a);
                aVar13.m13341c("networkResponse", response3M13388a2);
                aVar13.f30010h = response3M13388a2;
                response3M13339a2 = aVar13.m13339a();
                if (this.f30080b != null) {
                    if (!HttpHeaders2.m13485a(response3M13339a2) && CacheStrategy.f30085a.m13393a(response3M13339a2, request3)) {
                        Cache2 cache5 = this.f30080b;
                        Objects.requireNonNull(cache5);
                        Intrinsics2.m13090f(response3M13339a2, "response");
                        String str5 = response3M13339a2.f29990g.f29952c;
                        Intrinsics2.m13090f(str5, "method");
                        if (Intrinsics2.m13085a(str5, "POST") || Intrinsics2.m13085a(str5, "PATCH") || Intrinsics2.m13085a(str5, "PUT") || Intrinsics2.m13085a(str5, "DELETE") || Intrinsics2.m13085a(str5, "MOVE")) {
                            z2 = true;
                        }
                        try {
                            if (!z2) {
                                if (!Intrinsics2.m13085a(str5, "GET")) {
                                    dVar = null;
                                } else {
                                    Cache2.b bVar3 = Cache2.f29919f;
                                    Objects.requireNonNull(bVar3);
                                    Intrinsics2.m13090f(response3M13339a2, "$this$hasVaryAll");
                                    if (bVar3.m13306c(response3M13339a2.f29995l).contains("*")) {
                                        dVar = null;
                                    } else {
                                        Cache2.c cVar3 = new Cache2.c(response3M13339a2);
                                        try {
                                            DiskLruCache2 diskLruCache2 = cache5.f29920g;
                                            String strM13304a = bVar3.m13304a(response3M13339a2.f29990g.f29951b);
                                            String str6 = DiskLruCache2.f30100f;
                                            bVarM13402f = diskLruCache2.m13402f(strM13304a, DiskLruCache2.f30105k);
                                            if (bVarM13402f != null) {
                                                try {
                                                    cVar3.m13309c(bVarM13402f);
                                                    dVar = new Cache2.d(cache5, bVarM13402f);
                                                } catch (IOException unused8) {
                                                    if (bVarM13402f != null) {
                                                        bVarM13402f.m13408a();
                                                    }
                                                    dVar = null;
                                                }
                                            } else {
                                                dVar = null;
                                            }
                                        } catch (IOException unused9) {
                                            bVarM13402f = null;
                                        }
                                    }
                                }
                                if (dVar != null) {
                                    sink = dVar.f29945b;
                                    responseBody2 = response3M13339a2.f29996m;
                                    if (responseBody2 != null) {
                                        Intrinsics2.m13095k();
                                        throw null;
                                    }
                                    CacheInterceptor2 cacheInterceptor2 = new CacheInterceptor2(responseBody2.source(), dVar, SkuDao.a.m14081d(sink));
                                    String strM13336c = Response3.m13336c(response3M13339a2, HttpHeaders.CONTENT_TYPE, null, 2);
                                    long jContentLength = response3M13339a2.f29996m.contentLength();
                                    Response3.a aVar15 = new Response3.a(response3M13339a2);
                                    Intrinsics2.m13090f(cacheInterceptor2, "$this$buffer");
                                    aVar15.f30009g = new RealResponseBody(strM13336c, jContentLength, new RealBufferedSource(cacheInterceptor2));
                                    response3M13339a2 = aVar15.m13339a();
                                }
                                if (response3 != null) {
                                    Objects.requireNonNull(eventListener);
                                    Intrinsics2.m13090f(realCall, "call");
                                }
                                return response3M13339a2;
                            }
                            cache5.m13303a(response3M13339a2.f29990g);
                        } catch (IOException unused10) {
                        }
                        dVar = null;
                        if (dVar != null) {
                            sink = dVar.f29945b;
                            responseBody2 = response3M13339a2.f29996m;
                            if (responseBody2 != null) {
                                Intrinsics2.m13095k();
                                throw null;
                            }
                            CacheInterceptor2 cacheInterceptor3 = new CacheInterceptor2(responseBody2.source(), dVar, SkuDao.a.m14081d(sink));
                            String strM13336c2 = Response3.m13336c(response3M13339a2, HttpHeaders.CONTENT_TYPE, null, 2);
                            long jContentLength2 = response3M13339a2.f29996m.contentLength();
                            Response3.a aVar16 = new Response3.a(response3M13339a2);
                            Intrinsics2.m13090f(cacheInterceptor3, "$this$buffer");
                            aVar16.f30009g = new RealResponseBody(strM13336c2, jContentLength2, new RealBufferedSource(cacheInterceptor3));
                            response3M13339a2 = aVar16.m13339a();
                        }
                        if (response3 != null) {
                            Objects.requireNonNull(eventListener);
                            Intrinsics2.m13090f(realCall, "call");
                        }
                        return response3M13339a2;
                    }
                    str3 = request3.f29952c;
                    Intrinsics2.m13090f(str3, "method");
                    if (!Intrinsics2.m13085a(str3, "POST") || Intrinsics2.m13085a(str3, "PATCH") || Intrinsics2.m13085a(str3, "PUT") || Intrinsics2.m13085a(str3, "DELETE") || Intrinsics2.m13085a(str3, "MOVE")) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        try {
                            this.f30080b.m13303a(request3);
                        } catch (IOException unused11) {
                        }
                    }
                }
                return response3M13339a2;
            } catch (Throwable th) {
                if (response4 != null && (responseBody = response4.f29996m) != null) {
                    byte[] bArr4 = Util9.f30070a;
                    Intrinsics2.m13090f(responseBody, "$this$closeQuietly");
                    try {
                        responseBody.close();
                    } catch (RuntimeException e5) {
                        throw e5;
                    } catch (Exception unused12) {
                    }
                }
                throw th;
            }
        }
        cacheStrategy2 = new CacheStrategy(bVar2.f30098k, null);
        realInterceptorChain = realInterceptorChain;
        realCall3 = realCall3;
        r2 = 0;
        if (cacheStrategy2.f30086b != null) {
            cacheStrategy2 = new CacheStrategy(r2, r2);
        }
        request3 = cacheStrategy2.f30086b;
        response3 = cacheStrategy2.f30087c;
        cache2 = this.f30080b;
        if (cache2 != null) {
            synchronized (cache2) {
                Intrinsics2.m13090f(cacheStrategy2, "cacheStrategy");
                cache2.f29925l++;
                if (cacheStrategy2.f30086b != null) {
                    cache2.f29923j++;
                } else if (cacheStrategy2.f30087c != null) {
                    cache2.f29924k++;
                }
            }
        }
        realCall = realCall3;
        if (realCall instanceof RealCall) {
            realCall2 = null;
        } else {
            realCall2 = realCall;
        }
        if (realCall2 != null) {
            eventListener = EventListener.f30623a;
        } else {
            eventListener = EventListener.f30623a;
        }
        if (response4 != null) {
            byte[] bArr5 = Util9.f30070a;
            Intrinsics2.m13090f(responseBody6, "$this$closeQuietly");
            responseBody6.close();
        }
        if (request3 != null) {
        }
        if (request3 == null) {
            if (response3 != null) {
                Intrinsics2.m13095k();
                throw null;
            }
            Response3.a aVar17 = new Response3.a(response3);
            aVar17.m13340b(a.m13388a(f30079a, response3));
            Response3 response3M13339a6 = aVar17.m13339a();
            Objects.requireNonNull(eventListener);
            Intrinsics2.m13090f(realCall, "call");
            Intrinsics2.m13090f(response3M13339a6, "response");
            return response3M13339a6;
        }
        if (response3 != null) {
            Objects.requireNonNull(eventListener);
            Intrinsics2.m13090f(realCall, "call");
            Intrinsics2.m13090f(response3, "cachedResponse");
        } else if (this.f30080b != null) {
            Objects.requireNonNull(eventListener);
            Intrinsics2.m13090f(realCall, "call");
        }
        response3Mo13492a = ((RealInterceptorChain) aVar).mo13492a(request3);
        if (response3 != null) {
            z2 = false;
        } else {
            if (response3Mo13492a.f29993j == 304) {
                Response3.a aVar18 = new Response3.a(response3);
                aVar2 = f30079a;
                headers2 = response3.f29995l;
                headers3 = response3Mo13492a.f29995l;
                Objects.requireNonNull(aVar2);
                aVar3 = new Headers2.a();
                size = headers2.size();
                i2 = 0;
                while (i2 < size) {
                    strM13650f2 = headers2.m13650f(i2);
                    strM13653m = headers2.m13653m(i2);
                    if (StringsJVM.m12989f("Warning", strM13650f2, true)) {
                        headers4 = headers2;
                        if (StringsJVM.m12997n(strM13653m, "1", false, 2)) {
                        }
                        i2++;
                        headers2 = headers4;
                    } else {
                        headers4 = headers2;
                    }
                    if (aVar2.m13389b(strM13650f2)) {
                        aVar3.m13657c(strM13650f2, strM13653m);
                    } else {
                        aVar3.m13657c(strM13650f2, strM13653m);
                    }
                    i2++;
                    headers2 = headers4;
                }
                size2 = headers3.size();
                while (i3 < size2) {
                    strM13650f = headers3.m13650f(i3);
                    if (aVar2.m13389b(strM13650f)) {
                    }
                }
                aVar18.m13342d(aVar3.m13658d());
                aVar18.f30013k = response3Mo13492a.f30000q;
                aVar18.f30014l = response3Mo13492a.f30001r;
                a aVar19 = f30079a;
                aVar18.m13340b(a.m13388a(aVar19, response3));
                Response3 response3M13388a3 = a.m13388a(aVar19, response3Mo13492a);
                aVar18.m13341c("networkResponse", response3M13388a3);
                aVar18.f30010h = response3M13388a3;
                response3M13339a3 = aVar18.m13339a();
                responseBody4 = response3Mo13492a.f29996m;
                if (responseBody4 != null) {
                    Intrinsics2.m13095k();
                    throw null;
                }
                responseBody4.close();
                cache3 = this.f30080b;
                if (cache3 != null) {
                    Intrinsics2.m13095k();
                    throw null;
                }
                synchronized (cache3) {
                    cache3.f29924k++;
                    Objects.requireNonNull(this.f30080b);
                    Intrinsics2.m13090f(response3, "cached");
                    Intrinsics2.m13090f(response3M13339a3, "network");
                    cVar = new Cache2.c(response3M13339a3);
                    responseBody5 = response3.f29996m;
                    if (responseBody5 != null) {
                        throw new TypeCastException("null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
                    }
                    DiskLruCache2.d dVar3 = ((Cache2.a) responseBody5).f29927g;
                    bVarM13402f2 = dVar3.f30150i.m13402f(dVar3.f30147f, dVar3.f30148g);
                    if (bVarM13402f2 != null) {
                        cVar.m13309c(bVarM13402f2);
                        bVarM13402f2.m13409b();
                    }
                    Objects.requireNonNull(eventListener);
                    Intrinsics2.m13090f(realCall, "call");
                    Intrinsics2.m13090f(response3M13339a3, "response");
                    return response3M13339a3;
                }
            }
            z2 = false;
            responseBody3 = response3.f29996m;
            if (responseBody3 != null) {
                byte[] bArr6 = Util9.f30070a;
                Intrinsics2.m13090f(responseBody3, "$this$closeQuietly");
                responseBody3.close();
            }
        }
        Response3.a aVar110 = new Response3.a(response3Mo13492a);
        a aVar111 = f30079a;
        aVar110.m13340b(a.m13388a(aVar111, response3));
        Response3 response3M13388a4 = a.m13388a(aVar111, response3Mo13492a);
        aVar110.m13341c("networkResponse", response3M13388a4);
        aVar110.f30010h = response3M13388a4;
        response3M13339a2 = aVar110.m13339a();
        if (this.f30080b != null) {
            if (!HttpHeaders2.m13485a(response3M13339a2)) {
            }
            str3 = request3.f29952c;
            Intrinsics2.m13090f(str3, "method");
            if (Intrinsics2.m13085a(str3, "POST")) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (z3) {
                this.f30080b.m13303a(request3);
            }
        }
        return response3M13339a2;
    }
}
