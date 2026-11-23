package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.facebook.stetho.server.http.HttpStatus;
import com.facebook.stetho.websocket.CloseCodes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p007c.p190n.p194b.p266d.p298f.C2618j;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p309v.C2794c;

/* JADX INFO: renamed from: c.n.b.d.j.a.g3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3052g3 {

    /* JADX INFO: renamed from: A */
    public static final AbstractC3718y2<Boolean> f14149A;

    /* JADX INFO: renamed from: A0 */
    public static final AbstractC3718y2<Boolean> f14150A0;

    /* JADX INFO: renamed from: A1 */
    public static final AbstractC3718y2<String> f14151A1;

    /* JADX INFO: renamed from: A2 */
    public static final AbstractC3718y2<String> f14152A2;

    /* JADX INFO: renamed from: A3 */
    public static final AbstractC3718y2<Boolean> f14153A3;

    /* JADX INFO: renamed from: A4 */
    public static final AbstractC3718y2<Boolean> f14154A4;

    /* JADX INFO: renamed from: A5 */
    public static final AbstractC3718y2<Integer> f14155A5;

    /* JADX INFO: renamed from: B */
    public static final AbstractC3718y2<Boolean> f14156B;

    /* JADX INFO: renamed from: B0 */
    public static final AbstractC3718y2<Long> f14157B0;

    /* JADX INFO: renamed from: B1 */
    public static final AbstractC3718y2<Boolean> f14158B1;

    /* JADX INFO: renamed from: B2 */
    public static final AbstractC3718y2<String> f14159B2;

    /* JADX INFO: renamed from: B3 */
    public static final AbstractC3718y2<Long> f14160B3;

    /* JADX INFO: renamed from: B4 */
    public static final AbstractC3718y2<Boolean> f14161B4;

    /* JADX INFO: renamed from: B5 */
    public static final AbstractC3718y2<Boolean> f14162B5;

    /* JADX INFO: renamed from: C */
    public static final AbstractC3718y2<String> f14163C;

    /* JADX INFO: renamed from: C0 */
    public static final AbstractC3718y2<Boolean> f14164C0;

    /* JADX INFO: renamed from: C1 */
    public static final AbstractC3718y2<Boolean> f14165C1;

    /* JADX INFO: renamed from: C2 */
    public static final AbstractC3718y2<String> f14166C2;

    /* JADX INFO: renamed from: C3 */
    public static final AbstractC3718y2<Integer> f14167C3;

    /* JADX INFO: renamed from: C4 */
    public static final AbstractC3718y2<Boolean> f14168C4;

    /* JADX INFO: renamed from: C5 */
    public static final AbstractC3718y2<Boolean> f14169C5;

    /* JADX INFO: renamed from: D */
    public static final AbstractC3718y2<Integer> f14170D;

    /* JADX INFO: renamed from: D0 */
    public static final AbstractC3718y2<Long> f14171D0;

    /* JADX INFO: renamed from: D1 */
    public static final AbstractC3718y2<Boolean> f14172D1;

    /* JADX INFO: renamed from: D2 */
    public static final AbstractC3718y2<String> f14173D2;

    /* JADX INFO: renamed from: D3 */
    public static final AbstractC3718y2<Integer> f14174D3;

    /* JADX INFO: renamed from: D4 */
    public static final AbstractC3718y2<Boolean> f14175D4;

    /* JADX INFO: renamed from: D5 */
    public static final AbstractC3718y2<Integer> f14176D5;

    /* JADX INFO: renamed from: E */
    public static final AbstractC3718y2<String> f14177E;

    /* JADX INFO: renamed from: E0 */
    public static final AbstractC3718y2<Boolean> f14178E0;

    /* JADX INFO: renamed from: E1 */
    public static final AbstractC3718y2<Boolean> f14179E1;

    /* JADX INFO: renamed from: E2 */
    public static final AbstractC3718y2<Integer> f14180E2;

    /* JADX INFO: renamed from: E3 */
    public static final AbstractC3718y2<Integer> f14181E3;

    /* JADX INFO: renamed from: E4 */
    public static final AbstractC3718y2<String> f14182E4;

    /* JADX INFO: renamed from: E5 */
    public static final AbstractC3718y2<String> f14183E5;

    /* JADX INFO: renamed from: F */
    public static final AbstractC3718y2<String> f14184F;

    /* JADX INFO: renamed from: F0 */
    public static final AbstractC3718y2<Boolean> f14185F0;

    /* JADX INFO: renamed from: F1 */
    public static final AbstractC3718y2<Boolean> f14186F1;

    /* JADX INFO: renamed from: F2 */
    public static final AbstractC3718y2<Integer> f14187F2;

    /* JADX INFO: renamed from: F3 */
    public static final AbstractC3718y2<Integer> f14188F3;

    /* JADX INFO: renamed from: F4 */
    public static final AbstractC3718y2<Integer> f14189F4;

    /* JADX INFO: renamed from: G */
    public static final AbstractC3718y2<String> f14190G;

    /* JADX INFO: renamed from: G0 */
    public static final AbstractC3718y2<Boolean> f14191G0;

    /* JADX INFO: renamed from: G1 */
    public static final AbstractC3718y2<Boolean> f14192G1;

    /* JADX INFO: renamed from: G2 */
    public static final AbstractC3718y2<Boolean> f14193G2;

    /* JADX INFO: renamed from: G3 */
    public static final AbstractC3718y2<Boolean> f14194G3;

    /* JADX INFO: renamed from: G4 */
    public static final AbstractC3718y2<Boolean> f14195G4;

    /* JADX INFO: renamed from: H */
    public static final AbstractC3718y2<String> f14196H;

    /* JADX INFO: renamed from: H0 */
    public static final AbstractC3718y2<Boolean> f14197H0;

    /* JADX INFO: renamed from: H1 */
    public static final AbstractC3718y2<Boolean> f14198H1;

    /* JADX INFO: renamed from: H2 */
    public static final AbstractC3718y2<Boolean> f14199H2;

    /* JADX INFO: renamed from: H3 */
    public static final AbstractC3718y2<Boolean> f14200H3;

    /* JADX INFO: renamed from: H4 */
    public static final AbstractC3718y2<Integer> f14201H4;

    /* JADX INFO: renamed from: I */
    public static final AbstractC3718y2<Boolean> f14202I;

    /* JADX INFO: renamed from: I0 */
    public static final AbstractC3718y2<String> f14203I0;

    /* JADX INFO: renamed from: I1 */
    public static final AbstractC3718y2<Boolean> f14204I1;

    /* JADX INFO: renamed from: I2 */
    public static final AbstractC3718y2<Boolean> f14205I2;

    /* JADX INFO: renamed from: I3 */
    public static final AbstractC3718y2<Boolean> f14206I3;

    /* JADX INFO: renamed from: I4 */
    public static final AbstractC3718y2<Integer> f14207I4;

    /* JADX INFO: renamed from: J */
    public static final AbstractC3718y2<Boolean> f14208J;

    /* JADX INFO: renamed from: J0 */
    public static final AbstractC3718y2<String> f14209J0;

    /* JADX INFO: renamed from: J1 */
    public static final AbstractC3718y2<Boolean> f14210J1;

    /* JADX INFO: renamed from: J2 */
    public static final AbstractC3718y2<Boolean> f14211J2;

    /* JADX INFO: renamed from: J3 */
    public static final AbstractC3718y2<String> f14212J3;

    /* JADX INFO: renamed from: J4 */
    public static final AbstractC3718y2<Boolean> f14213J4;

    /* JADX INFO: renamed from: K */
    public static final AbstractC3718y2<Integer> f14214K;

    /* JADX INFO: renamed from: K0 */
    public static final AbstractC3718y2<Boolean> f14215K0;

    /* JADX INFO: renamed from: K1 */
    public static final AbstractC3718y2<Boolean> f14216K1;

    /* JADX INFO: renamed from: K2 */
    public static final AbstractC3718y2<Integer> f14217K2;

    /* JADX INFO: renamed from: K3 */
    public static final AbstractC3718y2<Boolean> f14218K3;

    /* JADX INFO: renamed from: K4 */
    public static final AbstractC3718y2<Boolean> f14219K4;

    /* JADX INFO: renamed from: L */
    public static final AbstractC3718y2<Integer> f14220L;

    /* JADX INFO: renamed from: L0 */
    public static final AbstractC3718y2<Long> f14221L0;

    /* JADX INFO: renamed from: L1 */
    public static final AbstractC3718y2<String> f14222L1;

    /* JADX INFO: renamed from: L2 */
    public static final AbstractC3718y2<Boolean> f14223L2;

    /* JADX INFO: renamed from: L3 */
    public static final AbstractC3718y2<Integer> f14224L3;

    /* JADX INFO: renamed from: L4 */
    public static final AbstractC3718y2<Boolean> f14225L4;

    /* JADX INFO: renamed from: M */
    public static final AbstractC3718y2<Integer> f14226M;

    /* JADX INFO: renamed from: M0 */
    public static final AbstractC3718y2<Long> f14227M0;

    /* JADX INFO: renamed from: M1 */
    public static final AbstractC3718y2<String> f14228M1;

    /* JADX INFO: renamed from: M2 */
    public static final AbstractC3718y2<Boolean> f14229M2;

    /* JADX INFO: renamed from: M3 */
    public static final AbstractC3718y2<Boolean> f14230M3;

    /* JADX INFO: renamed from: M4 */
    public static final AbstractC3718y2<Boolean> f14231M4;

    /* JADX INFO: renamed from: N */
    public static final AbstractC3718y2<String> f14232N;

    /* JADX INFO: renamed from: N0 */
    public static final AbstractC3718y2<Boolean> f14233N0;

    /* JADX INFO: renamed from: N1 */
    public static final AbstractC3718y2<String> f14234N1;

    /* JADX INFO: renamed from: N2 */
    public static final AbstractC3718y2<Boolean> f14235N2;

    /* JADX INFO: renamed from: N3 */
    public static final AbstractC3718y2<Boolean> f14236N3;

    /* JADX INFO: renamed from: N4 */
    public static final AbstractC3718y2<Boolean> f14237N4;

    /* JADX INFO: renamed from: O */
    public static final AbstractC3718y2<String> f14238O;

    /* JADX INFO: renamed from: O0 */
    public static final AbstractC3718y2<Boolean> f14239O0;

    /* JADX INFO: renamed from: O1 */
    public static final AbstractC3718y2<Boolean> f14240O1;

    /* JADX INFO: renamed from: O2 */
    public static final AbstractC3718y2<String> f14241O2;

    /* JADX INFO: renamed from: O3 */
    public static final AbstractC3718y2<Integer> f14242O3;

    /* JADX INFO: renamed from: O4 */
    public static final AbstractC3718y2<String> f14243O4;

    /* JADX INFO: renamed from: P */
    public static final AbstractC3718y2<Boolean> f14244P;

    /* JADX INFO: renamed from: P0 */
    public static final AbstractC3718y2<Boolean> f14245P0;

    /* JADX INFO: renamed from: P1 */
    public static final AbstractC3718y2<Integer> f14246P1;

    /* JADX INFO: renamed from: P2 */
    public static final AbstractC3718y2<String> f14247P2;

    /* JADX INFO: renamed from: P3 */
    public static final AbstractC3718y2<Boolean> f14248P3;

    /* JADX INFO: renamed from: P4 */
    public static final AbstractC3718y2<Boolean> f14249P4;

    /* JADX INFO: renamed from: Q */
    public static final AbstractC3718y2<Boolean> f14250Q;

    /* JADX INFO: renamed from: Q0 */
    public static final AbstractC3718y2<String> f14251Q0;

    /* JADX INFO: renamed from: Q1 */
    public static final AbstractC3718y2<Boolean> f14252Q1;

    /* JADX INFO: renamed from: Q2 */
    public static final AbstractC3718y2<Integer> f14253Q2;

    /* JADX INFO: renamed from: Q3 */
    public static final AbstractC3718y2<Boolean> f14254Q3;

    /* JADX INFO: renamed from: Q4 */
    public static final AbstractC3718y2<Boolean> f14255Q4;

    /* JADX INFO: renamed from: R */
    public static final AbstractC3718y2<Boolean> f14256R;

    /* JADX INFO: renamed from: R0 */
    public static final AbstractC3718y2<Long> f14257R0;

    /* JADX INFO: renamed from: R1 */
    public static final AbstractC3718y2<String> f14258R1;

    /* JADX INFO: renamed from: R2 */
    public static final AbstractC3718y2<Boolean> f14259R2;

    /* JADX INFO: renamed from: R3 */
    public static final AbstractC3718y2<Boolean> f14260R3;

    /* JADX INFO: renamed from: R4 */
    public static final AbstractC3718y2<Integer> f14261R4;

    /* JADX INFO: renamed from: S */
    public static final AbstractC3718y2<Boolean> f14262S;

    /* JADX INFO: renamed from: S0 */
    public static final AbstractC3718y2<String> f14263S0;

    /* JADX INFO: renamed from: S1 */
    public static final AbstractC3718y2<Boolean> f14264S1;

    /* JADX INFO: renamed from: S2 */
    public static final AbstractC3718y2<Integer> f14265S2;

    /* JADX INFO: renamed from: S3 */
    public static final AbstractC3718y2<Boolean> f14266S3;

    /* JADX INFO: renamed from: S4 */
    public static final AbstractC3718y2<Boolean> f14267S4;

    /* JADX INFO: renamed from: T */
    public static final AbstractC3718y2<String> f14268T;

    /* JADX INFO: renamed from: T0 */
    public static final AbstractC3718y2<Boolean> f14269T0;

    /* JADX INFO: renamed from: T1 */
    public static final AbstractC3718y2<Boolean> f14270T1;

    /* JADX INFO: renamed from: T2 */
    public static final AbstractC3718y2<Boolean> f14271T2;

    /* JADX INFO: renamed from: T3 */
    public static final AbstractC3718y2<Boolean> f14272T3;

    /* JADX INFO: renamed from: T4 */
    public static final AbstractC3718y2<Boolean> f14273T4;

    /* JADX INFO: renamed from: U */
    public static final AbstractC3718y2<String> f14274U;

    /* JADX INFO: renamed from: U0 */
    public static final AbstractC3718y2<Boolean> f14275U0;

    /* JADX INFO: renamed from: U1 */
    public static final AbstractC3718y2<Boolean> f14276U1;

    /* JADX INFO: renamed from: U2 */
    public static final AbstractC3718y2<Boolean> f14277U2;

    /* JADX INFO: renamed from: U3 */
    public static final AbstractC3718y2<Integer> f14278U3;

    /* JADX INFO: renamed from: U4 */
    public static final AbstractC3718y2<Boolean> f14279U4;

    /* JADX INFO: renamed from: V */
    public static final AbstractC3718y2<Boolean> f14280V;

    /* JADX INFO: renamed from: V0 */
    public static final AbstractC3718y2<Boolean> f14281V0;

    /* JADX INFO: renamed from: V1 */
    public static final AbstractC3718y2<Boolean> f14282V1;

    /* JADX INFO: renamed from: V2 */
    public static final AbstractC3718y2<Boolean> f14283V2;

    /* JADX INFO: renamed from: V3 */
    public static final AbstractC3718y2<Integer> f14284V3;

    /* JADX INFO: renamed from: V4 */
    public static final AbstractC3718y2<Integer> f14285V4;

    /* JADX INFO: renamed from: W */
    public static final AbstractC3718y2<String> f14286W;

    /* JADX INFO: renamed from: W0 */
    public static final AbstractC3718y2<Boolean> f14287W0;

    /* JADX INFO: renamed from: W1 */
    public static final AbstractC3718y2<Boolean> f14288W1;

    /* JADX INFO: renamed from: W2 */
    public static final AbstractC3718y2<Boolean> f14289W2;

    /* JADX INFO: renamed from: W3 */
    public static final AbstractC3718y2<String> f14290W3;

    /* JADX INFO: renamed from: W4 */
    public static final AbstractC3718y2<Integer> f14291W4;

    /* JADX INFO: renamed from: X */
    public static final AbstractC3718y2<Long> f14292X;

    /* JADX INFO: renamed from: X0 */
    public static final AbstractC3718y2<Integer> f14293X0;

    /* JADX INFO: renamed from: X1 */
    public static final AbstractC3718y2<Boolean> f14294X1;

    /* JADX INFO: renamed from: X2 */
    public static final AbstractC3718y2<Boolean> f14295X2;

    /* JADX INFO: renamed from: X3 */
    public static final AbstractC3718y2<String> f14296X3;

    /* JADX INFO: renamed from: X4 */
    public static final AbstractC3718y2<Boolean> f14297X4;

    /* JADX INFO: renamed from: Y */
    public static final AbstractC3718y2<Integer> f14298Y;

    /* JADX INFO: renamed from: Y0 */
    public static final AbstractC3718y2<Boolean> f14299Y0;

    /* JADX INFO: renamed from: Y1 */
    public static final AbstractC3718y2<Boolean> f14300Y1;

    /* JADX INFO: renamed from: Y2 */
    public static final AbstractC3718y2<Boolean> f14301Y2;

    /* JADX INFO: renamed from: Y3 */
    public static final AbstractC3718y2<String> f14302Y3;

    /* JADX INFO: renamed from: Y4 */
    public static final AbstractC3718y2<Boolean> f14303Y4;

    /* JADX INFO: renamed from: Z */
    public static final AbstractC3718y2<Boolean> f14304Z;

    /* JADX INFO: renamed from: Z0 */
    public static final AbstractC3718y2<Boolean> f14305Z0;

    /* JADX INFO: renamed from: Z1 */
    public static final AbstractC3718y2<Boolean> f14306Z1;

    /* JADX INFO: renamed from: Z2 */
    public static final AbstractC3718y2<Integer> f14307Z2;

    /* JADX INFO: renamed from: Z3 */
    public static final AbstractC3718y2<String> f14308Z3;

    /* JADX INFO: renamed from: Z4 */
    public static final AbstractC3718y2<Boolean> f14309Z4;

    /* JADX INFO: renamed from: a */
    public static final AbstractC3718y2<String> f14310a = new C3681x2("gads:sdk_core_location:client:html", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.html");

    /* JADX INFO: renamed from: a0 */
    public static final AbstractC3718y2<Integer> f14311a0;

    /* JADX INFO: renamed from: a1 */
    public static final AbstractC3718y2<Integer> f14312a1;

    /* JADX INFO: renamed from: a2 */
    public static final AbstractC3718y2<Boolean> f14313a2;

    /* JADX INFO: renamed from: a3 */
    public static final AbstractC3718y2<Integer> f14314a3;

    /* JADX INFO: renamed from: a4 */
    public static final AbstractC3718y2<Integer> f14315a4;

    /* JADX INFO: renamed from: a5 */
    public static final AbstractC3718y2<Boolean> f14316a5;

    /* JADX INFO: renamed from: b */
    public static final AbstractC3718y2<String> f14317b;

    /* JADX INFO: renamed from: b0 */
    public static final AbstractC3718y2<Boolean> f14318b0;

    /* JADX INFO: renamed from: b1 */
    public static final AbstractC3718y2<Long> f14319b1;

    /* JADX INFO: renamed from: b2 */
    public static final AbstractC3718y2<Long> f14320b2;

    /* JADX INFO: renamed from: b3 */
    public static final AbstractC3718y2<Boolean> f14321b3;

    /* JADX INFO: renamed from: b4 */
    public static final AbstractC3718y2<Integer> f14322b4;

    /* JADX INFO: renamed from: b5 */
    public static final AbstractC3718y2<Boolean> f14323b5;

    /* JADX INFO: renamed from: c */
    public static final AbstractC3718y2<Integer> f14324c;

    /* JADX INFO: renamed from: c0 */
    public static final AbstractC3718y2<Boolean> f14325c0;

    /* JADX INFO: renamed from: c1 */
    public static final AbstractC3718y2<Long> f14326c1;

    /* JADX INFO: renamed from: c2 */
    public static final AbstractC3718y2<Long> f14327c2;

    /* JADX INFO: renamed from: c3 */
    public static final AbstractC3718y2<Boolean> f14328c3;

    /* JADX INFO: renamed from: c4 */
    public static final AbstractC3718y2<Integer> f14329c4;

    /* JADX INFO: renamed from: c5 */
    public static final AbstractC3718y2<Boolean> f14330c5;

    /* JADX INFO: renamed from: d */
    public static final AbstractC3718y2<Integer> f14331d;

    /* JADX INFO: renamed from: d0 */
    public static final AbstractC3718y2<Boolean> f14332d0;

    /* JADX INFO: renamed from: d1 */
    public static final AbstractC3718y2<Boolean> f14333d1;

    /* JADX INFO: renamed from: d2 */
    public static final AbstractC3718y2<Boolean> f14334d2;

    /* JADX INFO: renamed from: d3 */
    public static final AbstractC3718y2<String> f14335d3;

    /* JADX INFO: renamed from: d4 */
    public static final AbstractC3718y2<Integer> f14336d4;

    /* JADX INFO: renamed from: d5 */
    public static final AbstractC3718y2<Boolean> f14337d5;

    /* JADX INFO: renamed from: e */
    public static final AbstractC3718y2<Integer> f14338e;

    /* JADX INFO: renamed from: e0 */
    public static final AbstractC3718y2<Boolean> f14339e0;

    /* JADX INFO: renamed from: e1 */
    public static final AbstractC3718y2<Boolean> f14340e1;

    /* JADX INFO: renamed from: e2 */
    public static final AbstractC3718y2<Boolean> f14341e2;

    /* JADX INFO: renamed from: e3 */
    public static final AbstractC3718y2<Boolean> f14342e3;

    /* JADX INFO: renamed from: e4 */
    public static final AbstractC3718y2<String> f14343e4;

    /* JADX INFO: renamed from: e5 */
    public static final AbstractC3718y2<Boolean> f14344e5;

    /* JADX INFO: renamed from: f */
    public static final AbstractC3718y2<Integer> f14345f;

    /* JADX INFO: renamed from: f0 */
    public static final AbstractC3718y2<Boolean> f14346f0;

    /* JADX INFO: renamed from: f1 */
    public static final AbstractC3718y2<Boolean> f14347f1;

    /* JADX INFO: renamed from: f2 */
    public static final AbstractC3718y2<Boolean> f14348f2;

    /* JADX INFO: renamed from: f3 */
    public static final AbstractC3718y2<Boolean> f14349f3;

    /* JADX INFO: renamed from: f4 */
    public static final AbstractC3718y2<String> f14350f4;

    /* JADX INFO: renamed from: f5 */
    public static final AbstractC3718y2<Boolean> f14351f5;

    /* JADX INFO: renamed from: g */
    public static final AbstractC3718y2<Integer> f14352g;

    /* JADX INFO: renamed from: g0 */
    public static final AbstractC3718y2<Boolean> f14353g0;

    /* JADX INFO: renamed from: g1 */
    public static final AbstractC3718y2<Boolean> f14354g1;

    /* JADX INFO: renamed from: g2 */
    public static final AbstractC3718y2<Long> f14355g2;

    /* JADX INFO: renamed from: g3 */
    public static final AbstractC3718y2<Boolean> f14356g3;

    /* JADX INFO: renamed from: g4 */
    public static final AbstractC3718y2<String> f14357g4;

    /* JADX INFO: renamed from: g5 */
    public static final AbstractC3718y2<Boolean> f14358g5;

    /* JADX INFO: renamed from: h */
    public static final AbstractC3718y2<Integer> f14359h;

    /* JADX INFO: renamed from: h0 */
    public static final AbstractC3718y2<Boolean> f14360h0;

    /* JADX INFO: renamed from: h1 */
    public static final AbstractC3718y2<Boolean> f14361h1;

    /* JADX INFO: renamed from: h2 */
    public static final AbstractC3718y2<Boolean> f14362h2;

    /* JADX INFO: renamed from: h3 */
    public static final AbstractC3718y2<Boolean> f14363h3;

    /* JADX INFO: renamed from: h4 */
    public static final AbstractC3718y2<String> f14364h4;

    /* JADX INFO: renamed from: h5 */
    public static final AbstractC3718y2<Integer> f14365h5;

    /* JADX INFO: renamed from: i */
    public static final AbstractC3718y2<String> f14366i;

    /* JADX INFO: renamed from: i0 */
    public static final AbstractC3718y2<Boolean> f14367i0;

    /* JADX INFO: renamed from: i1 */
    public static final AbstractC3718y2<Boolean> f14368i1;

    /* JADX INFO: renamed from: i2 */
    public static final AbstractC3718y2<Boolean> f14369i2;

    /* JADX INFO: renamed from: i3 */
    public static final AbstractC3718y2<Boolean> f14370i3;

    /* JADX INFO: renamed from: i4 */
    public static final AbstractC3718y2<Integer> f14371i4;

    /* JADX INFO: renamed from: i5 */
    public static final AbstractC3718y2<Integer> f14372i5;

    /* JADX INFO: renamed from: j */
    public static final AbstractC3718y2<Integer> f14373j;

    /* JADX INFO: renamed from: j0 */
    public static final AbstractC3718y2<String> f14374j0;

    /* JADX INFO: renamed from: j1 */
    public static final AbstractC3718y2<Boolean> f14375j1;

    /* JADX INFO: renamed from: j2 */
    public static final AbstractC3718y2<Long> f14376j2;

    /* JADX INFO: renamed from: j3 */
    public static final AbstractC3718y2<Integer> f14377j3;

    /* JADX INFO: renamed from: j4 */
    public static final AbstractC3718y2<String> f14378j4;

    /* JADX INFO: renamed from: j5 */
    public static final AbstractC3718y2<Integer> f14379j5;

    /* JADX INFO: renamed from: k */
    public static final AbstractC3718y2<Boolean> f14380k;

    /* JADX INFO: renamed from: k0 */
    public static final AbstractC3718y2<Boolean> f14381k0;

    /* JADX INFO: renamed from: k1 */
    public static final AbstractC3718y2<Boolean> f14382k1;

    /* JADX INFO: renamed from: k2 */
    public static final AbstractC3718y2<Long> f14383k2;

    /* JADX INFO: renamed from: k3 */
    public static final AbstractC3718y2<Boolean> f14384k3;

    /* JADX INFO: renamed from: k4 */
    public static final AbstractC3718y2<Integer> f14385k4;

    /* JADX INFO: renamed from: k5 */
    public static final AbstractC3718y2<Boolean> f14386k5;

    /* JADX INFO: renamed from: l */
    public static final AbstractC3718y2<Boolean> f14387l;

    /* JADX INFO: renamed from: l0 */
    public static final AbstractC3718y2<Boolean> f14388l0;

    /* JADX INFO: renamed from: l1 */
    public static final AbstractC3718y2<Boolean> f14389l1;

    /* JADX INFO: renamed from: l2 */
    public static final AbstractC3718y2<Boolean> f14390l2;

    /* JADX INFO: renamed from: l3 */
    public static final AbstractC3718y2<Boolean> f14391l3;

    /* JADX INFO: renamed from: l4 */
    public static final AbstractC3718y2<Integer> f14392l4;

    /* JADX INFO: renamed from: l5 */
    public static final AbstractC3718y2<Boolean> f14393l5;

    /* JADX INFO: renamed from: m */
    public static final AbstractC3718y2<Boolean> f14394m;

    /* JADX INFO: renamed from: m0 */
    public static final AbstractC3718y2<String> f14395m0;

    /* JADX INFO: renamed from: m1 */
    public static final AbstractC3718y2<Boolean> f14396m1;

    /* JADX INFO: renamed from: m2 */
    public static final AbstractC3718y2<Boolean> f14397m2;

    /* JADX INFO: renamed from: m3 */
    public static final AbstractC3718y2<Boolean> f14398m3;

    /* JADX INFO: renamed from: m4 */
    public static final AbstractC3718y2<Boolean> f14399m4;

    /* JADX INFO: renamed from: m5 */
    public static final AbstractC3718y2<Boolean> f14400m5;

    /* JADX INFO: renamed from: n */
    public static final AbstractC3718y2<Integer> f14401n;

    /* JADX INFO: renamed from: n0 */
    public static final AbstractC3718y2<Boolean> f14402n0;

    /* JADX INFO: renamed from: n1 */
    public static final AbstractC3718y2<Boolean> f14403n1;

    /* JADX INFO: renamed from: n2 */
    public static final AbstractC3718y2<Boolean> f14404n2;

    /* JADX INFO: renamed from: n3 */
    public static final AbstractC3718y2<Boolean> f14405n3;

    /* JADX INFO: renamed from: n4 */
    public static final AbstractC3718y2<Boolean> f14406n4;

    /* JADX INFO: renamed from: n5 */
    public static final AbstractC3718y2<String> f14407n5;

    /* JADX INFO: renamed from: o */
    public static final AbstractC3718y2<Integer> f14408o;

    /* JADX INFO: renamed from: o0 */
    public static final AbstractC3718y2<Boolean> f14409o0;

    /* JADX INFO: renamed from: o1 */
    public static final AbstractC3718y2<Boolean> f14410o1;

    /* JADX INFO: renamed from: o2 */
    public static final AbstractC3718y2<String> f14411o2;

    /* JADX INFO: renamed from: o3 */
    public static final AbstractC3718y2<String> f14412o3;

    /* JADX INFO: renamed from: o4 */
    public static final AbstractC3718y2<Boolean> f14413o4;

    /* JADX INFO: renamed from: o5 */
    public static final AbstractC3718y2<Integer> f14414o5;

    /* JADX INFO: renamed from: p */
    public static final AbstractC3718y2<Integer> f14415p;

    /* JADX INFO: renamed from: p0 */
    public static final AbstractC3718y2<Boolean> f14416p0;

    /* JADX INFO: renamed from: p1 */
    public static final AbstractC3718y2<String> f14417p1;

    /* JADX INFO: renamed from: p2 */
    public static final AbstractC3718y2<Integer> f14418p2;

    /* JADX INFO: renamed from: p3 */
    public static final AbstractC3718y2<Integer> f14419p3;

    /* JADX INFO: renamed from: p4 */
    public static final AbstractC3718y2<Boolean> f14420p4;

    /* JADX INFO: renamed from: p5 */
    public static final AbstractC3718y2<Integer> f14421p5;

    /* JADX INFO: renamed from: q */
    public static final AbstractC3718y2<Long> f14422q;

    /* JADX INFO: renamed from: q0 */
    public static final AbstractC3718y2<Integer> f14423q0;

    /* JADX INFO: renamed from: q1 */
    public static final AbstractC3718y2<Boolean> f14424q1;

    /* JADX INFO: renamed from: q2 */
    public static final AbstractC3718y2<Boolean> f14425q2;

    /* JADX INFO: renamed from: q3 */
    public static final AbstractC3718y2<Boolean> f14426q3;

    /* JADX INFO: renamed from: q4 */
    public static final AbstractC3718y2<Boolean> f14427q4;

    /* JADX INFO: renamed from: q5 */
    public static final AbstractC3718y2<Boolean> f14428q5;

    /* JADX INFO: renamed from: r */
    public static final AbstractC3718y2<Long> f14429r;

    /* JADX INFO: renamed from: r0 */
    public static final AbstractC3718y2<Boolean> f14430r0;

    /* JADX INFO: renamed from: r1 */
    public static final C2979e4<Boolean> f14431r1;

    /* JADX INFO: renamed from: r2 */
    public static final AbstractC3718y2<Boolean> f14432r2;

    /* JADX INFO: renamed from: r3 */
    public static final AbstractC3718y2<Boolean> f14433r3;

    /* JADX INFO: renamed from: r4 */
    public static final AbstractC3718y2<String> f14434r4;

    /* JADX INFO: renamed from: r5 */
    public static final AbstractC3718y2<Float> f14435r5;

    /* JADX INFO: renamed from: s */
    public static final AbstractC3718y2<Integer> f14436s;

    /* JADX INFO: renamed from: s0 */
    public static final AbstractC3718y2<Boolean> f14437s0;

    /* JADX INFO: renamed from: s1 */
    public static final AbstractC3718y2<Boolean> f14438s1;

    /* JADX INFO: renamed from: s2 */
    public static final AbstractC3718y2<Boolean> f14439s2;

    /* JADX INFO: renamed from: s3 */
    public static final AbstractC3718y2<Boolean> f14440s3;

    /* JADX INFO: renamed from: s4 */
    public static final AbstractC3718y2<Boolean> f14441s4;

    /* JADX INFO: renamed from: s5 */
    public static final AbstractC3718y2<Integer> f14442s5;

    /* JADX INFO: renamed from: t */
    public static final AbstractC3718y2<String> f14443t;

    /* JADX INFO: renamed from: t0 */
    public static final AbstractC3718y2<Boolean> f14444t0;

    /* JADX INFO: renamed from: t1 */
    public static final AbstractC3718y2<Long> f14445t1;

    /* JADX INFO: renamed from: t2 */
    public static final AbstractC3718y2<Boolean> f14446t2;

    /* JADX INFO: renamed from: t3 */
    public static final AbstractC3718y2<Boolean> f14447t3;

    /* JADX INFO: renamed from: t4 */
    public static final AbstractC3718y2<Boolean> f14448t4;

    /* JADX INFO: renamed from: t5 */
    public static final AbstractC3718y2<Integer> f14449t5;

    /* JADX INFO: renamed from: u */
    public static final AbstractC3718y2<Long> f14450u;

    /* JADX INFO: renamed from: u0 */
    public static final AbstractC3718y2<Boolean> f14451u0;

    /* JADX INFO: renamed from: u1 */
    public static final AbstractC3718y2<Boolean> f14452u1;

    /* JADX INFO: renamed from: u2 */
    public static final AbstractC3718y2<Boolean> f14453u2;

    /* JADX INFO: renamed from: u3 */
    public static final AbstractC3718y2<Boolean> f14454u3;

    /* JADX INFO: renamed from: u4 */
    public static final AbstractC3718y2<Boolean> f14455u4;

    /* JADX INFO: renamed from: u5 */
    public static final AbstractC3718y2<Integer> f14456u5;

    /* JADX INFO: renamed from: v */
    public static final AbstractC3718y2<Boolean> f14457v;

    /* JADX INFO: renamed from: v0 */
    public static final AbstractC3718y2<String> f14458v0;

    /* JADX INFO: renamed from: v1 */
    public static final AbstractC3718y2<Boolean> f14459v1;

    /* JADX INFO: renamed from: v2 */
    public static final AbstractC3718y2<Boolean> f14460v2;

    /* JADX INFO: renamed from: v3 */
    public static final AbstractC3718y2<Boolean> f14461v3;

    /* JADX INFO: renamed from: v4 */
    public static final AbstractC3718y2<Boolean> f14462v4;

    /* JADX INFO: renamed from: v5 */
    public static final AbstractC3718y2<Boolean> f14463v5;

    /* JADX INFO: renamed from: w */
    public static final AbstractC3718y2<Long> f14464w;

    /* JADX INFO: renamed from: w0 */
    public static final AbstractC3718y2<Boolean> f14465w0;

    /* JADX INFO: renamed from: w1 */
    public static final AbstractC3718y2<Boolean> f14466w1;

    /* JADX INFO: renamed from: w2 */
    public static final AbstractC3718y2<Boolean> f14467w2;

    /* JADX INFO: renamed from: w3 */
    public static final AbstractC3718y2<Boolean> f14468w3;

    /* JADX INFO: renamed from: w4 */
    public static final AbstractC3718y2<Integer> f14469w4;

    /* JADX INFO: renamed from: w5 */
    public static final AbstractC3718y2<Float> f14470w5;

    /* JADX INFO: renamed from: x */
    public static final AbstractC3718y2<Boolean> f14471x;

    /* JADX INFO: renamed from: x0 */
    public static final AbstractC3718y2<Boolean> f14472x0;

    /* JADX INFO: renamed from: x1 */
    public static final AbstractC3718y2<Boolean> f14473x1;

    /* JADX INFO: renamed from: x2 */
    public static final AbstractC3718y2<String> f14474x2;

    /* JADX INFO: renamed from: x3 */
    public static final AbstractC3718y2<Boolean> f14475x3;

    /* JADX INFO: renamed from: x4 */
    public static final AbstractC3718y2<Integer> f14476x4;

    /* JADX INFO: renamed from: x5 */
    public static final AbstractC3718y2<Integer> f14477x5;

    /* JADX INFO: renamed from: y */
    public static final AbstractC3718y2<Integer> f14478y;

    /* JADX INFO: renamed from: y0 */
    public static final AbstractC3718y2<Long> f14479y0;

    /* JADX INFO: renamed from: y1 */
    public static final AbstractC3718y2<Boolean> f14480y1;

    /* JADX INFO: renamed from: y2 */
    public static final AbstractC3718y2<Boolean> f14481y2;

    /* JADX INFO: renamed from: y3 */
    public static final AbstractC3718y2<Boolean> f14482y3;

    /* JADX INFO: renamed from: y4 */
    public static final AbstractC3718y2<Boolean> f14483y4;

    /* JADX INFO: renamed from: y5 */
    public static final AbstractC3718y2<Integer> f14484y5;

    /* JADX INFO: renamed from: z */
    public static final AbstractC3718y2<Long> f14485z;

    /* JADX INFO: renamed from: z0 */
    public static final AbstractC3718y2<Long> f14486z0;

    /* JADX INFO: renamed from: z1 */
    public static final AbstractC3718y2<Boolean> f14487z1;

    /* JADX INFO: renamed from: z2 */
    public static final AbstractC3718y2<Long> f14488z2;

    /* JADX INFO: renamed from: z3 */
    public static final AbstractC3718y2<Boolean> f14489z3;

    /* JADX INFO: renamed from: z4 */
    public static final AbstractC3718y2<Boolean> f14490z4;

    /* JADX INFO: renamed from: z5 */
    public static final AbstractC3718y2<Integer> f14491z5;

    static {
        new C3681x2("gads:active_view_location:html", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.html");
        C2979e4<Boolean> c2979e4 = C3534t4.f19762c;
        AbstractC3718y2.m8765f(1, "gads:http_url_connection_factory:timeout_millis", 10000);
        f14317b = new C3681x2("gads:video_exo_player:version", "3");
        f14324c = AbstractC3718y2.m8765f(1, "gads:video_exo_player:connect_timeout", 8000);
        f14331d = AbstractC3718y2.m8765f(1, "gads:video_exo_player:read_timeout", 8000);
        f14338e = AbstractC3718y2.m8765f(1, "gads:video_exo_player:loading_check_interval", 1048576);
        f14345f = AbstractC3718y2.m8765f(1, "gads:video_exo_player:exo_player_precache_limit", Integer.MAX_VALUE);
        f14352g = AbstractC3718y2.m8765f(1, "gads:video_exo_player:byte_buffer_precache_limit", Integer.MAX_VALUE);
        f14359h = AbstractC3718y2.m8765f(1, "gads:video_exo_player_socket_receive_buffer_size", 0);
        f14366i = new C3681x2("gads:video_exo_player:precache_exceptions", "");
        f14373j = AbstractC3718y2.m8765f(1, "gads:video_exo_player:min_retry_count", -1);
        Boolean bool = Boolean.TRUE;
        f14380k = new C3532t2(1, "gads:video_exo_player:fmp4_extractor_enabled", bool);
        Boolean bool2 = Boolean.FALSE;
        f14387l = new C3532t2(1, "gads:video_exo_player:use_play_back_info_for_should_start_play_back", bool2);
        f14394m = new C3532t2(1, "gads:video_exo_player:treat_load_exception_as_non_fatal", bool2);
        f14401n = AbstractC3718y2.m8765f(1, "gads:video_stream_cache:limit_count", 5);
        f14408o = AbstractC3718y2.m8765f(1, "gads:video_stream_cache:limit_space", 8388608);
        f14415p = AbstractC3718y2.m8765f(1, "gads:video_stream_exo_cache:buffer_size", 8388608);
        f14422q = AbstractC3718y2.m8766g(1, "gads:video_stream_cache:limit_time_sec", 300L);
        f14429r = AbstractC3718y2.m8766g(1, "gads:video_stream_cache:notify_interval_millis", 125L);
        f14436s = AbstractC3718y2.m8765f(1, "gads:video_stream_cache:connect_timeout_millis", 10000);
        f14443t = new C3681x2("gads:video:metric_frame_hash_times", "");
        f14450u = AbstractC3718y2.m8766g(1, "gads:video:metric_frame_hash_time_leniency", 500L);
        f14457v = new C3532t2(1, "gads:video:force_watermark", bool2);
        f14464w = AbstractC3718y2.m8766g(1, "gads:video:surface_update_min_spacing_ms", 1000L);
        f14471x = new C3532t2(1, "gads:video:spinner:enabled", bool2);
        f14478y = AbstractC3718y2.m8765f(1, "gads:video:spinner:scale", 4);
        f14485z = AbstractC3718y2.m8766g(1, "gads:video:spinner:jank_threshold_ms", 50L);
        f14149A = new C3532t2(1, "gads:video:aggressive_media_codec_release", bool2);
        f14156B = new C3532t2(1, "gads:memory_bundle:debug_info", bool2);
        f14163C = new C3681x2("gads:video:codec_query_mime_types", "");
        f14170D = AbstractC3718y2.m8765f(1, "gads:video:codec_query_minimum_version", 16);
        f14177E = new C3681x2("gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_banner.js");
        f14184F = new C3681x2("gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_expanded_banner.js");
        f14190G = new C3681x2("gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_interstitial.js");
        f14196H = new C3681x2("gad:mraid:version", "3.0");
        f14202I = new C3532t2(1, "gads:mraid:expanded_interstitial_fix", bool2);
        f14208J = new C3532t2(1, "gads:mraid:initial_size_fallback", bool2);
        f14214K = AbstractC3718y2.m8765f(1, "gads:content_vertical_fingerprint_number", 100);
        f14220L = AbstractC3718y2.m8765f(1, "gads:content_vertical_fingerprint_bits", 23);
        f14226M = AbstractC3718y2.m8765f(1, "gads:content_vertical_fingerprint_ngram", 3);
        f14232N = new C3681x2("gads:content_fetch_view_tag_id", "googlebot");
        f14238O = new C3681x2("gads:content_fetch_exclude_view_tag", "none");
        f14244P = new C3532t2(1, "gads:content_fetch_disable_get_title_from_webview", bool2);
        f14250Q = new C3532t2(1, "gads:content_fetch_enable_new_content_score", bool2);
        f14256R = new C3532t2(1, "gads:content_fetch_enable_serve_once", bool2);
        f14262S = new C3532t2(1, "gads:sai:enabled", bool);
        f14268T = new C3681x2("gads:sai:click_ping_schema_v2", "^[^?]*(/aclk\\?|/pcs/click\\?).*");
        f14274U = new C3681x2("gads:sai:impression_ping_schema_v2", "^[^?]*(/adview|/pcs/view).*");
        f14280V = new C3532t2(1, "gads:sai:using_macro:enabled", bool2);
        f14286W = new C3681x2("gads:sai:ad_event_id_macro_name", "[gw_fbsaeid]");
        f14292X = AbstractC3718y2.m8766g(1, "gads:sai:timeout_ms", -1L);
        f14298Y = AbstractC3718y2.m8765f(1, "gads:sai:scion_thread_pool_size", 5);
        f14304Z = new C3532t2(1, "gads:sai:app_measurement_enabled3", bool2);
        f14311a0 = AbstractC3718y2.m8765f(1, "gads:sai:app_measurement_min_client_dynamite_version", 20290);
        f14318b0 = new C3532t2(1, "gads:sai:force_through_reflection", bool);
        f14325c0 = new C3532t2(1, "gads:sai:gmscore_availability_check_disabled", bool2);
        f14332d0 = new C3532t2(1, "gads:sai:logging_disabled_for_drx", bool2);
        f14339e0 = new C3532t2(1, "gads:sai:app_measurement_npa_enabled", bool2);
        f14346f0 = new C3532t2(1, "gads:idless:idless_disables_attestation", bool);
        f14353g0 = new C3532t2(1, "gads:idless:app_measurement_idless_enabled", bool);
        f14360h0 = new C3532t2(1, "gads:sai:server_side_npa:disable_writing", bool2);
        f14367i0 = new C3532t2(1, "gads:sai:server_side_npa:enabled", bool2);
        AbstractC3718y2.m8766g(1, "gads:sai:server_side_npa:ttl", TimeUnit.DAYS.toMillis(90L));
        f14374j0 = new C3681x2("gads:sai:server_side_npa:shared_preference_key_list", "{  \"__default__\": [    \"IABTCF_TCString\"  ],  \"mobileads_consent\": [    \"consent_string\"  ]}");
        f14381k0 = new C3532t2(1, "gads:idless:internal_state_enabled", bool);
        f14388l0 = new C3532t2(1, "gads:idless:idless_disables_offline_ads_signalling", bool);
        f14395m0 = new C3681x2("gads:idless:cookie_modification", "=; Max-Age=-1; path=/; domain=.doubleclick.net");
        f14402n0 = new C3532t2(1, "gads:interstitial:app_must_be_foreground:enabled", bool2);
        f14409o0 = new C3532t2(1, "gads:interstitial:foreground_report:enabled", bool2);
        f14416p0 = new C3532t2(1, "gads:interstitial:default_immersive", bool2);
        f14423q0 = AbstractC3718y2.m8765f(1, "gads:show_interstitial_with_context:min_version", 999999999);
        f14430r0 = new C3532t2(1, "gads:webview:error_web_response:enabled", bool2);
        f14437s0 = new C3532t2(1, "gads:webview:set_fixed_text_zoom", bool2);
        f14444t0 = new C3532t2(1, "gads:webviewgone:kill_process:enabled", bool2);
        f14451u0 = new C3532t2(1, "gads:webviewgone:new_onshow:enabled", bool2);
        f14458v0 = new C3681x2("gads:webview_cookie_url", "googleads.g.doubleclick.net");
        new C3532t2(1, "gads:new_rewarded_ad:enabled", bool);
        f14465w0 = new C3532t2(1, "gads:rewarded:adapter_initialization_enabled", bool2);
        f14472x0 = new C3532t2(1, "gads:rewarded:ad_metadata_enabled", bool2);
        f14479y0 = AbstractC3718y2.m8766g(1, "gads:app_activity_tracker:notify_background_listeners_delay_ms", 500L);
        f14486z0 = AbstractC3718y2.m8766g(1, "gads:app_activity_tracker:app_session_timeout_ms", TimeUnit.MINUTES.toMillis(5L));
        f14150A0 = new C3532t2(1, "gads:adid_values_in_adrequest:enabled", bool2);
        f14157B0 = AbstractC3718y2.m8766g(1, "gads:adid_values_in_adrequest:timeout", 2000L);
        f14164C0 = new C3532t2(1, "gads:disable_adid_values_in_ms", bool2);
        f14171D0 = AbstractC3718y2.m8766g(1, "gads:ad_overlay:delay_page_close_timeout_ms", 5000L);
        f14178E0 = new C3532t2(1, "gads:custom_close_blocking:enabled", bool2);
        f14185F0 = new C3532t2(1, "gads:disabling_closable_area:enabled", bool2);
        f14191G0 = new C3532t2(1, "gads:use_system_ui_for_fullscreen:enabled", bool2);
        f14197H0 = new C3532t2(1, "gads:ad_overlay:collect_cutout_info:enabled", bool2);
        f14203I0 = new C3681x2("gads:spherical_video:vertex_shader", "");
        f14209J0 = new C3681x2("gads:spherical_video:fragment_shader", "");
        f14215K0 = new C3532t2(1, "gads:include_local_global_rectangles", bool2);
        f14221L0 = AbstractC3718y2.m8766g(1, "gads:position_watcher:throttle_ms", 200L);
        f14227M0 = AbstractC3718y2.m8766g(1, "gads:position_watcher:scroll_aware_throttle_ms", 33L);
        f14233N0 = new C3532t2(1, "gads:position_watcher:enable_scroll_aware_ads", bool2);
        f14239O0 = new C3532t2(1, "gads:position_watcher:send_scroll_data", bool2);
        new C3532t2(1, "gads:gen204_signals:enabled", bool2);
        f14245P0 = new C3532t2(1, "gads:extra_sdk_versions_for_crash_reports:enabled", bool);
        f14251Q0 = new C3681x2("gads:logged_adapter_version_classes", "");
        f14257R0 = AbstractC3718y2.m8766g(1, "gads:rtb_v1_1:signal_timeout_ms", 1000L);
        f14263S0 = new C3681x2("gads:rtb_logging:regex", "(?!)");
        f14269T0 = new C3532t2(1, "gads:presentation_error:urls_enabled", bool);
        f14275U0 = new C3532t2(1, "gads:rtb_interstitial:use_fullscreen_monitor", bool);
        f14281V0 = new C3532t2(1, "gads:native_required_assets:enabled", bool2);
        f14287W0 = new C3532t2(1, "gads:native_required_assets:check_inner_mediaview:enabled", bool);
        f14293X0 = AbstractC3718y2.m8765f(1, "gads:native_ad_options_rtb:min_version", 999999999);
        f14299Y0 = new C3532t2(1, "gads:track_view_next_runloop:enabled", bool2);
        f14305Z0 = new C3532t2(1, "gads:native_required_assets:viewability:enabled", bool2);
        f14312a1 = AbstractC3718y2.m8765f(1, "gads:adapter_initialization:min_sdk_version", 15301000);
        f14319b1 = AbstractC3718y2.m8766g(1, "gads:adapter_initialization:timeout", 30L);
        f14326c1 = AbstractC3718y2.m8766g(1, "gads:adapter_initialization:cld_timeout", 10L);
        f14333d1 = new C3532t2(1, "gads:additional_video_csi:enabled", bool2);
        f14340e1 = new C3532t2(1, "gads:csi:enabled_per_sampling", bool2);
        f14347f1 = new C3532t2(1, "gads:always_set_transfer_listener:enabled", bool2);
        f14354g1 = new C3532t2(1, "gads:initialization_csi:enabled", bool2);
        f14361h1 = new C3532t2(1, "gads:msa:experiments:enabled", bool2);
        f14368i1 = new C3532t2(1, "gads:msa:experiments:ps:enabled", bool2);
        f14375j1 = new C3532t2(1, "gads:msa:experiments:fb:enabled", bool);
        f14382k1 = new C3532t2(1, "gads:msa:experiments:ps:er", bool);
        AbstractC3718y2.m8765f(1, "gads:gestures:a2:enabled", 0);
        f14389l1 = new C3532t2(1, "gads:msa:experiments:a2", bool2);
        f14396m1 = new C3532t2(1, "gads:msa:experiments:log", bool);
        f14403n1 = new C3532t2(1, "gads:msa:experiments:vfb", bool);
        f14410o1 = new C3532t2(1, "gads:msa:experiments:incapi:enabled", bool2);
        f14417p1 = new C3681x2("gads:msa:experiments:incapi:trusted_cert", "308204433082032ba003020102020900c2e08746644a308d300d06092a864886f70d01010405003074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964301e170d3038303832313233313333345a170d3336303130373233313333345a3074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f696430820120300d06092a864886f70d01010105000382010d00308201080282010100ab562e00d83ba208ae0a966f124e29da11f2ab56d08f58e2cca91303e9b754d372f640a71b1dcb130967624e4656a7776a92193db2e5bfb724a91e77188b0e6a47a43b33d9609b77183145ccdf7b2e586674c9e1565b1f4c6a5955bff251a63dabf9c55c27222252e875e4f8154a645f897168c0b1bfc612eabf785769bb34aa7984dc7e2ea2764cae8307d8c17154d7ee5f64a51a44a602c249054157dc02cd5f5c0e55fbef8519fbe327f0b1511692c5a06f19d18385f5c4dbc2d6b93f68cc2979c70e18ab93866b3bd5db8999552a0e3b4c99df58fb918bedc182ba35e003c1b4b10dd244a8ee24fffd333872ab5221985edab0fc0d0b145b6aa192858e79020103a381d93081d6301d0603551d0e04160414c77d8cc2211756259a7fd382df6be398e4d786a53081a60603551d2304819e30819b8014c77d8cc2211756259a7fd382df6be398e4d786a5a178a4763074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964820900c2e08746644a308d300c0603551d13040530030101ff300d06092a864886f70d010104050003820101006dd252ceef85302c360aaace939bcff2cca904bb5d7a1661f8ae46b2994204d0ff4a68c7ed1a531ec4595a623ce60763b167297a7ae35712c407f208f0cb109429124d7b106219c084ca3eb3f9ad5fb871ef92269a8be28bf16d44c8d9a08e6cb2f005bb3fe2cb96447e868e731076ad45b33f6009ea19c161e62641aa99271dfd5228c5c587875ddb7f452758d661f6cc0cccb7352e424cc4365c523532f7325137593c4ae341f4db41edda0d0b1071a7c440f0fe9ea01cb627ca674369d084bd2fd911ff06cdbf2cfa10dc0f893ae35762919048c7efc64c7144178342f70581c9de573af55b390dd7fdb9418631895d5f759f30112687ff621410c069308a");
        f14424q1 = new C3532t2(1, "gads:gestures:clearTd:enabled", bool2);
        f14431r1 = C3497s4.f19462b;
        f14438s1 = new C3532t2(1, "gads:gestures:errorlogging:enabled", bool2);
        f14445t1 = AbstractC3718y2.m8766g(1, "gads:gestures:task_timeout", 2000L);
        f14452u1 = new C3532t2(1, "gads:gestures:asig:enabled", bool2);
        f14459v1 = new C3532t2(1, "gads:gestures:ans:enabled", bool2);
        f14466w1 = new C3532t2(1, "gads:gestures:tos:enabled", bool2);
        new C3532t2(1, "gads:gestures:brt:enabled", bool);
        f14473x1 = new C3532t2(1, "gads:gestures:fpi:enabled", bool2);
        f14480y1 = new C3532t2(1, "gads:signal:app_permissions:disabled", bool2);
        f14487z1 = new C3532t2(1, "gads:gestures:hpk:enabled", bool);
        f14151A1 = new C3681x2("gads:gestures:pk", "");
        f14158B1 = new C3532t2(1, "gads:gestures:bs:enabled", bool);
        f14165C1 = new C3532t2(1, "gads:gestures:check_initialization_thread:enabled", bool2);
        f14172D1 = new C3532t2(1, "gads:gestures:init_new_thread:enabled", bool);
        f14179E1 = new C3532t2(1, "gads:gestures:pds:enabled", bool);
        AbstractC3718y2.m8765f(1, "gads:gestures:as2percentage", 0);
        f14186F1 = new C3532t2(1, "gads:gestures:ns:enabled", bool);
        f14192G1 = new C3532t2(1, "gads:gestures:vdd:enabled", bool2);
        f14198H1 = new C3532t2(1, "gads:native:asset_view_touch_events", bool2);
        f14204I1 = new C3532t2(1, "gads:native:set_touch_listener_on_asset_views", bool);
        f14210J1 = new C3532t2(1, "gads:ais:enabled", bool);
        f14216K1 = new C3532t2(1, "gads:stav:enabled", bool2);
        AbstractC3718y2.m8769j(1);
        f14222L1 = new C3681x2("gads:sdk_core_constants:caps", "");
        new C3532t2(1, "gads:js_flags:disable_phenotype", bool2);
        f14228M1 = new C3681x2("gads:native:engine_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");
        f14234N1 = new C3681x2("gads:native:video_url_with_protocol", "https://imasdk.googleapis.com/admob/sdkloader/native_video.html");
        f14240O1 = new C3532t2(1, "gads:native:get_native_ad_view_signals", bool2);
        f14246P1 = AbstractC3718y2.m8765f(1, "gads:native_video_load_timeout", 10);
        f14252Q1 = new C3532t2(1, "gads:omid:native_video_ad_user_action_event:enabled", bool2);
        f14258R1 = new C3681x2("gads:ad_choices_content_description", "Ad Choices Icon");
        f14264S1 = new C3532t2(1, "gads:enable_singleton_broadcast_receiver", bool2);
        f14270T1 = new C3532t2(1, "gads:native:media_view_match_parent:enabled", bool2);
        f14276U1 = new C3532t2(1, "gads:video:restrict_inside_web_view:enabled", bool2);
        f14282V1 = new C3532t2(1, "gads:native:count_impression_for_assets", bool2);
        f14288W1 = new C3532t2(1, "gads:fluid_ad:use_wrap_content_height", bool2);
        f14294X1 = new C3532t2(1, "gads:rtb_v1_1:fetch_app_settings_using_cld:enabled", bool);
        f14300Y1 = new C3532t2(1, "gads:get_request_signals_cld:enabled", bool);
        f14306Z1 = new C3532t2(1, "gads:get_request_signals_common_cld:enabled", bool2);
        f14313a2 = new C3532t2(1, "gads:rtb_v1_1:use_manifest_appid_cld:enabled", bool);
        f14320b2 = AbstractC3718y2.m8766g(1, "gads:fetch_app_settings_using_cld:refresh_interval_ms", 7200000L);
        f14327c2 = AbstractC3718y2.m8766g(1, "gads:parental_controls:timeout", 2000L);
        AbstractC3718y2.m8765f(1, "gads:cache:ad_request_timeout_millis", 250);
        AbstractC3718y2.m8765f(1, "gads:cache:max_concurrent_downloads", 10);
        new C3532t2(1, "gads:cache:downloader_use_high_priority", bool2);
        AbstractC3718y2.m8766g(1, "gads:cache:javascript_timeout_millis", 5000L);
        f14334d2 = new C3532t2(1, "gads:cache:bind_on_foreground", bool2);
        f14341e2 = new C3532t2(1, "gads:cache:bind_on_init", bool2);
        f14348f2 = new C3532t2(1, "gads:cache:bind_on_request", bool2);
        f14355g2 = AbstractC3718y2.m8766g(1, "gads:cache:bind_on_request_keep_alive", TimeUnit.SECONDS.toMillis(30L));
        f14362h2 = new C3532t2(1, "gads:cache:use_cache_data_source", bool2);
        f14369i2 = new C3532t2(1, "gads:cache:connection_per_read", bool2);
        f14376j2 = AbstractC3718y2.m8766g(1, "gads:cache:connection_timeout", 5000L);
        f14383k2 = AbstractC3718y2.m8766g(1, "gads:cache:read_only_connection_timeout", 5000L);
        f14390l2 = new C3532t2(1, "gads:cache:read_inner_data_source_if_gcache_miss", bool2);
        f14397m2 = new C3532t2(1, "gads:cache:read_inner_data_source_if_gcache_not_downloaded", bool2);
        new C3532t2(1, "gads:cache:function_call_timeout_v1:enabled", bool2);
        AbstractC3718y2.m8766g(1, "gads:cache:function_call_timeout", 5000L);
        f14404n2 = new C3532t2(1, "gads:http_assets_cache:enabled", bool2);
        f14411o2 = new C3681x2("gads:http_assets_cache:regex", "(?i)https:\\/\\/(tpc\\.googlesyndication\\.com\\/(.*)|lh\\d+\\.googleusercontent\\.com\\/(.*))");
        f14418p2 = AbstractC3718y2.m8765f(1, "gads:http_assets_cache:time_out", 100);
        f14425q2 = new C3532t2(1, "gads:chrome_custom_tabs_browser:enabled", bool2);
        f14432r2 = new C3532t2(1, "gads:chrome_custom_tabs:disabled", bool2);
        f14439s2 = new C3532t2(1, "gads:chrome_custom_tabs_browser_v2:enabled", bool2);
        f14446t2 = new C3532t2(1, "gads:cct_v2_connection:enabled", bool2);
        f14453u2 = new C3532t2(1, "gads:cct_v2_direct_launch:enabled", bool2);
        f14460v2 = new C3532t2(1, "gads:chrome_custom_tabs_for_native_ads:enabled", bool2);
        f14467w2 = new C3532t2(1, "gad:cct_v2_beta:enabled", bool2);
        f14474x2 = new C3681x2("gad:publisher_testing:cct_v2:enabled_list", "");
        f14481y2 = new C3532t2(2, "CHROME_CUSTOM_TAB_OPT_OUT", bool2);
        f14488z2 = AbstractC3718y2.m8766g(1, "gads:debug_hold_gesture:time_millis", 2000L);
        f14152A2 = new C3681x2("gads:drx_debug:debug_device_linking_url", "https://www.google.com/dfp/linkDevice");
        f14159B2 = new C3681x2("gads:drx_debug:in_app_preview_status_url", "https://www.google.com/dfp/inAppPreview");
        f14166C2 = new C3681x2("gads:drx_debug:debug_signal_status_url", "https://www.google.com/dfp/debugSignals");
        f14173D2 = new C3681x2("gads:drx_debug:send_debug_data_url", "https://www.google.com/dfp/sendDebugData");
        f14180E2 = AbstractC3718y2.m8765f(1, "gads:drx_debug:timeout_ms", 5000);
        f14187F2 = AbstractC3718y2.m8765f(1, "gad:pixel_dp_comparision_multiplier", 1);
        f14193G2 = new C3532t2(1, "gad:interstitial_notify_publisher_without_delay", bool2);
        f14199H2 = new C3532t2(1, "gad:interstitial_for_multi_window", bool2);
        f14205I2 = new C3532t2(1, "gad:interstitial_ad_stay_active_in_multi_window", bool2);
        f14211J2 = new C3532t2(1, "gad:interstitial_multi_window_method", bool2);
        f14217K2 = AbstractC3718y2.m8765f(1, "gad:interstitial:close_button_padding_dip", 0);
        f14223L2 = new C3532t2(1, "gads:clearcut_logging:enabled", bool2);
        f14229M2 = new C3532t2(1, "gads:clearcut_logging:write_to_file", bool2);
        f14235N2 = new C3532t2(1, "gad:publisher_testing:force_local_request:enabled", bool);
        f14241O2 = new C3681x2("gad:publisher_testing:force_local_request:enabled_list", "");
        f14247P2 = new C3681x2("gad:publisher_testing:force_local_request:disabled_list", "");
        f14253Q2 = AbstractC3718y2.m8765f(1, "gad:http_redirect_max_count:times", 8);
        f14259R2 = new C3532t2(1, "gads:omid:enabled", bool);
        f14265S2 = AbstractC3718y2.m8765f(1, "gads:omid:destroy_webview_delay", CloseCodes.NORMAL_CLOSURE);
        f14271T2 = new C3532t2(1, "gads:omid_1_3_activate:enabled", bool2);
        f14277U2 = new C3532t2(1, "gads:omid_1_3_create_html_session:enabled", bool2);
        f14283V2 = new C3532t2(1, "gads:omid_1_3_create_js_session:enabled", bool2);
        f14289W2 = new C3532t2(1, "gads:omid_1_3_friendly_obstruction:enabled", bool2);
        f14295X2 = new C3532t2(1, "gads:omid_1_3_fire_loaded_event:enabled", bool2);
        f14301Y2 = new C3532t2(1, "gads:omid_use_admob_impl_dependency:enabled", bool2);
        new C3532t2(1, "gads:nonagon:banner:enabled", bool);
        new C3681x2("gads:nonagon:banner:ad_unit_exclusions", "(?!)");
        new C3532t2(1, "gads:nonagon:app_open:enabled", bool);
        f14307Z2 = AbstractC3718y2.m8765f(1, "gads:app_open_beta:min_version", 999999999);
        f14314a3 = AbstractC3718y2.m8765f(1, "gads:app_open_ad_open_beta_api:min_version", 202490999);
        f14321b3 = new C3532t2(1, "gads:nonagon:app_open_app_switch_signal:enabled", bool2);
        new C3681x2("gads:nonagon:app_open:ad_unit_exclusions", "(?!)");
        new C3532t2(1, "gads:nonagon:interstitial:enabled", bool);
        new C3681x2("gads:nonagon:interstitial:ad_unit_exclusions", "(?!)");
        new C3532t2(1, "gads:nonagon:rewardedvideo:enabled", bool);
        f14328c3 = new C3532t2(1, "gads:nonagon:mobile_ads_setting_manager:enabled", bool);
        f14335d3 = new C3681x2("gads:nonagon:rewardedvideo:ad_unit_exclusions", "(?!)");
        f14342e3 = new C3532t2(1, "gads:nonagon:banner:check_dp_size", bool);
        f14349f3 = new C3532t2(1, "gads:nonagon:rewarded:load_multiple_ads", bool);
        f14356g3 = new C3532t2(1, "gads:nonagon:return_no_fill_error_code", bool2);
        f14363h3 = new C3532t2(1, "gads:nonagon:continue_on_no_fill", bool2);
        f14370i3 = new C3532t2(1, "gads:nonagon:separate_timeout:enabled", bool);
        f14377j3 = AbstractC3718y2.m8765f(1, "gads:nonagon:request_timeout:seconds", 60);
        f14384k3 = new C3532t2(1, "gads:nonagon:banner_recursive_renderer", bool2);
        f14391l3 = new C3532t2(1, "gads:nonagon:app_stats_lock:enabled", bool2);
        f14398m3 = new C3532t2(1, "gads:nonagon:app_stats_main_thread:enabled", bool2);
        f14405n3 = new C3532t2(1, "gads:uri_query_to_map_bg_thread:enabled", bool2);
        f14412o3 = new C3681x2("gads:uri_query_to_map_bg_thread:types", "/result");
        f14419p3 = AbstractC3718y2.m8765f(1, "gads:uri_query_to_map_bg_thread:min_length", CloseCodes.NORMAL_CLOSURE);
        f14426q3 = new C3532t2(1, "gads:nonagon:active_view_gmsg_background_thread:enabled", bool);
        f14433r3 = new C3532t2(1, "gads:active_view_gmsg_separate_pool:enabled", bool);
        f14440s3 = new C3532t2(1, "gads:signals:ad_id_info:enabled", bool2);
        f14447t3 = new C3532t2(1, "gads:signals:app_index:enabled", bool2);
        f14454u3 = new C3532t2(1, "gads:signals:attestation_token:enabled", bool2);
        f14461v3 = new C3532t2(1, "gads:signals:cache:enabled", bool2);
        new C3532t2(1, "gads:signals:doritos:enabled", bool2);
        f14468w3 = new C3532t2(1, "gads:signals:doritos:v1:enabled", bool2);
        new C3532t2(1, "gads:signals:doritos:v2:immediate:enabled", bool2);
        f14475x3 = new C3532t2(1, "gads:signals:parental_control:enabled", bool2);
        f14482y3 = new C3532t2(1, "gads:signals:video_decoder:enabled", bool2);
        f14489z3 = new C3532t2(1, "gads:signals:banner_hardware_acceleration:enabled", bool2);
        f14153A3 = new C3532t2(1, "gads:signals:native_hardware_acceleration:enabled", bool2);
        new C3532t2(1, "gads:attestation_token:enabled", bool2);
        f14160B3 = AbstractC3718y2.m8766g(1, "gads:mobius_linking:sdk_side_cooldown_time_threshold:ms", 3600000L);
        f14167C3 = AbstractC3718y2.m8765f(1, "gads:adoverlay:b68684796:targeting_sdk:lower_bound", 27);
        f14174D3 = AbstractC3718y2.m8765f(1, "gads:adoverlay:b68684796:targeting_sdk:upper_bound", 26);
        f14181E3 = AbstractC3718y2.m8765f(1, "gads:adoverlay:b68684796:sdk_int:lower_bound", 27);
        f14188F3 = AbstractC3718y2.m8765f(1, "gads:adoverlay:b68684796:sdk_int:upper_bound", 26);
        f14194G3 = new C3532t2(1, "gads:consent:shared_preference_reading:enabled", bool);
        f14200H3 = new C3532t2(1, "gads:consent:iab_consent_info:enabled", bool);
        f14206I3 = new C3532t2(1, "gads:fc_consent:shared_preference_reading:enabled", bool);
        f14212J3 = new C3681x2("gads:sp:json_string", "");
        f14218K3 = new C3532t2(1, "gads:nativeads:image:sample:enabled", bool);
        f14224L3 = AbstractC3718y2.m8765f(1, "gads:nativeads:image:sample:pixels", 1048576);
        f14230M3 = new C3532t2(1, "gads:nativeads:pub_image_scale_type:enabled", bool);
        f14236N3 = new C3532t2(1, "gads:offline_signaling:enabled", bool2);
        f14242O3 = AbstractC3718y2.m8765f(1, "gads:offline_signaling:log_maximum", 100);
        f14248P3 = new C3532t2(1, "gads:nativeads:template_signal:enabled", bool);
        f14254Q3 = new C3532t2(1, "gads:nativeads:media_content_aspect_ratio:enabled", bool);
        f14260R3 = new C3532t2(1, "gads:nativeads:media_content_metadata:enabled", bool);
        f14266S3 = new C3532t2(1, "gads:predictive_prefetch_from_cld:enabled", bool2);
        f14272T3 = new C3532t2(1, "gads:precache_pool:verbose_logging", bool2);
        f14278U3 = AbstractC3718y2.m8765f(1, "gads:rewarded_precache_pool:count", 0);
        f14284V3 = AbstractC3718y2.m8765f(1, "gads:interstitial_precache_pool:count", 0);
        f14290W3 = new C3681x2("gads:rewarded_precache_pool:discard_strategy", "lru");
        f14296X3 = new C3681x2("gads:interstitial_precache_pool:discard_strategy", "lru");
        f14302Y3 = AbstractC3718y2.m8768i(1, "gads:rewarded_precache_pool:cache_start_trigger", "onAdClosed");
        f14308Z3 = AbstractC3718y2.m8768i(1, "gads:interstitial_precache_pool:cache_start_trigger", "onAdClosed");
        f14315a4 = AbstractC3718y2.m8765f(1, "gads:rewarded_precache_pool:size", 1);
        f14322b4 = AbstractC3718y2.m8765f(1, "gads:interstitial_precache_pool:size", 1);
        f14329c4 = AbstractC3718y2.m8765f(1, "gads:rewarded_precache_pool:ad_time_limit", 1200);
        f14336d4 = AbstractC3718y2.m8765f(1, "gads:interstitial_precache_pool:ad_time_limit", 1200);
        f14343e4 = AbstractC3718y2.m8768i(1, "gads:rewarded_precache_pool:schema", "customTargeting,npa,tagForChildDirectedTreatment,tagForUnderAgeOfConsent,maxAdContentRating");
        f14350f4 = AbstractC3718y2.m8768i(1, "gads:interstitial_precache_pool:schema", "customTargeting,npa,tagForChildDirectedTreatment,tagForUnderAgeOfConsent,maxAdContentRating");
        f14357g4 = AbstractC3718y2.m8768i(1, "gads:app_open_precache_pool:schema", "orientation,npa,tagForChildDirectedTreatment,tagForUnderAgeOfConsent,maxAdContentRating");
        f14364h4 = AbstractC3718y2.m8768i(1, "gads:app_open_precache_pool:discard_strategy", "oldest");
        f14371i4 = AbstractC3718y2.m8765f(1, "gads:app_open_precache_pool:count", 0);
        f14378j4 = AbstractC3718y2.m8768i(1, "gads:app_open_precache_pool:cache_start_trigger", "onAdClosed");
        f14385k4 = AbstractC3718y2.m8765f(1, "gads:app_open_precache_pool:size", 1);
        f14392l4 = AbstractC3718y2.m8765f(1, "gads:app_open_precache_pool:ad_time_limit", 14400);
        f14399m4 = AbstractC3718y2.m8764e(1, "gads:memory_leak:b129558083", bool2);
        f14406n4 = AbstractC3718y2.m8764e(1, "gads:unhandled_event_reporting:enabled", bool2);
        f14413o4 = AbstractC3718y2.m8764e(1, "gads:response_info:enabled", bool);
        f14420p4 = AbstractC3718y2.m8764e(1, "gads:csi:interstitial_failed_to_show:enabled", bool2);
        f14427q4 = AbstractC3718y2.m8764e(1, "gads:csi:mediation_failure:enabled", bool2);
        f14434r4 = AbstractC3718y2.m8768i(1, "gads:csi:error_parsing:regex", "^(\\d+)");
        f14441s4 = AbstractC3718y2.m8764e(1, "gads:csi:eids_from_cld:enabled", bool2);
        f14448t4 = AbstractC3718y2.m8764e(1, "gads:request_id_check:enabled", bool2);
        f14455u4 = AbstractC3718y2.m8764e(1, "gads:request_id_int32:enabled", bool);
        f14462v4 = AbstractC3718y2.m8764e(1, "gads:signal_collection_without_rendering:enabled", bool);
        f14469w4 = AbstractC3718y2.m8765f(1, "gads:native_ads_signal:timeout", CloseCodes.NORMAL_CLOSURE);
        f14476x4 = AbstractC3718y2.m8765f(1, "gads:signal_v2:min_version", 19677000);
        f14483y4 = AbstractC3718y2.m8764e(2, "DISABLE_CRASH_REPORTING", bool2);
        f14490z4 = AbstractC3718y2.m8764e(1, "gads:paid_event_listener:enabled", bool);
        f14154A4 = AbstractC3718y2.m8764e(1, "gads:interscroller_ad:enabled", bool);
        f14161B4 = AbstractC3718y2.m8764e(1, "gads:interscroller_ad:refresh:enabled", bool2);
        AbstractC3718y2.m8765f(1, "gads:interscroller:min_width", 300);
        AbstractC3718y2.m8765f(1, "gads:interscroller:min_height", 250);
        f14168C4 = AbstractC3718y2.m8764e(1, "gads:is_in_scroll_view_new_api:enabled", bool);
        f14175D4 = AbstractC3718y2.m8764e(1, "gads:policy_validator_for_all_pubs:enabled", bool2);
        f14182E4 = AbstractC3718y2.m8768i(1, "gad:publisher_testing:policy_validator:enabled_list", "");
        f14189F4 = AbstractC3718y2.m8765f(1, "gads:policy_validator_layoutparam:flags", 808);
        f14195G4 = AbstractC3718y2.m8764e(2, "NATIVE_AD_DEBUGGER_ENABLED", bool);
        f14201H4 = AbstractC3718y2.m8765f(1, "gads:policy_validator_overlay_width:dp", 350);
        f14207I4 = AbstractC3718y2.m8765f(1, "gads:policy_validator_overlay_height:dp", 140);
        f14213J4 = AbstractC3718y2.m8764e(1, "gads:use_wide_viewport:enabled", bool2);
        f14219K4 = AbstractC3718y2.m8764e(1, "gads:load_with_overview_mode:enabled", bool2);
        f14225L4 = AbstractC3718y2.m8764e(1, "gads:wire_banner_listener_after_request:enabled", bool2);
        f14231M4 = AbstractC3718y2.m8764e(1, "gads:wire_app_open_listener_after_request:enabled", bool2);
        f14237N4 = AbstractC3718y2.m8764e(1, "gads:wire_interstitial_listener_after_request:enabled", bool2);
        f14243O4 = AbstractC3718y2.m8768i(1, "gads:server_transaction_source:list", "Network");
        f14249P4 = AbstractC3718y2.m8764e(1, "gads:can_open_app_and_open_app_action:enabled", bool2);
        f14255Q4 = AbstractC3718y2.m8764e(1, "gads:open_gmsg:set_uri_data_and_type:enabled", bool2);
        f14261R4 = AbstractC3718y2.m8765f(1, "gads:ad_error_api:min_version", 202006000);
        f14267S4 = AbstractC3718y2.m8764e(1, "gads:forward_bow_error_string:enabled", bool);
        f14273T4 = AbstractC3718y2.m8764e(1, "gads:continue_on_process_response:enabled", bool2);
        f14279U4 = AbstractC3718y2.m8764e(1, "gads:mediation_status_reporting:enabled", bool);
        f14285V4 = AbstractC3718y2.m8765f(1, "gads:mediation_no_fill_error:min_version", 999999999);
        f14291W4 = AbstractC3718y2.m8765f(1, "gads:offline_database_version:version", 1);
        f14297X4 = AbstractC3718y2.m8764e(1, "gads:offline_ads_notification:enabled", bool);
        f14303Y4 = AbstractC3718y2.m8764e(1, "gads:use_new_network_api:enabled", bool);
        f14309Z4 = AbstractC3718y2.m8764e(1, "gads:handle_click_recorded_event:enabled", bool2);
        f14316a5 = AbstractC3718y2.m8764e(1, "gads:default_network_type_fine_to_unknown:enabled", bool);
        f14323b5 = AbstractC3718y2.m8764e(1, "gads:handle_intent_async:enabled", bool2);
        f14330c5 = AbstractC3718y2.m8764e(1, "gads:skip_deep_link_validation_native_ads:enabled", bool2);
        f14337d5 = AbstractC3718y2.m8764e(1, "gads:try_deep_link_fallback_native_ads:enabled", bool2);
        f14344e5 = AbstractC3718y2.m8764e(1, "gads:in_app_link_handling_for_android_11_enabled:enabled", bool2);
        f14351f5 = AbstractC3718y2.m8764e(1, "gads:new_remote_logging_utils:enabled", bool2);
        f14358g5 = AbstractC3718y2.m8764e(1, "gads:remote_logging:enabled", bool2);
        f14365h5 = AbstractC3718y2.m8765f(1, "gads:remote_log_send_rate_ms", 60000);
        f14372i5 = AbstractC3718y2.m8765f(1, "gads:remote_log_queue_max_entries", HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
        f14379j5 = AbstractC3718y2.m8765f(1, "gads:app_event_queue_size", 20);
        f14386k5 = AbstractC3718y2.m8764e(1, "gads:hide_grey_title_bar:enabled", bool2);
        f14393l5 = AbstractC3718y2.m8764e(1, "gads:interstitial_ad_parameter_handler:enabled", bool2);
        f14400m5 = AbstractC3718y2.m8764e(1, "gads:inspector:enabled", bool);
        f14407n5 = AbstractC3718y2.m8768i(1, "gads:inspector:ui_url", "https://admob-gmats.uc.r.appspot.com/");
        f14414o5 = AbstractC3718y2.m8765f(1, "gads:inspector:max_ad_life_cycles", CloseCodes.NORMAL_CLOSURE);
        f14421p5 = AbstractC3718y2.m8765f(1, "gads:inspector:ui_invocation_millis", 2000);
        f14428q5 = AbstractC3718y2.m8764e(1, "gads:inspector:shake_enabled", bool);
        f14435r5 = AbstractC3718y2.m8767h(1, "gads:inspector:shake_strength", 2.0f);
        f14442s5 = AbstractC3718y2.m8765f(1, "gads:inspector:shake_interval", HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
        f14449t5 = AbstractC3718y2.m8765f(1, "gads:inspector:shake_reset_time_ms", 3000);
        f14456u5 = AbstractC3718y2.m8765f(1, "gads:inspector:shake_count", 3);
        f14463v5 = AbstractC3718y2.m8764e(1, "gads:inspector:flick_enabled", bool);
        f14470w5 = AbstractC3718y2.m8767h(1, "gads:inspector:flick_rotation_threshold", 45.0f);
        f14477x5 = AbstractC3718y2.m8765f(1, "gads:inspector:flick_reset_time_ms", 3000);
        f14484y5 = AbstractC3718y2.m8765f(1, "gads:inspector:flick_count", 2);
        f14491z5 = AbstractC3718y2.m8765f(1, "gads:inspector:icon_width_px", 256);
        f14155A5 = AbstractC3718y2.m8765f(1, "gads:inspector:icon_height_px", 256);
        f14162B5 = AbstractC3718y2.m8764e(1, "gads:paw_register_webview:enabled", bool);
        f14169C5 = AbstractC3718y2.m8764e(1, "gads:h5ads:enabled", bool);
        f14176D5 = AbstractC3718y2.m8765f(1, "gads:h5ads:max_num_ad_objects", 10);
        AbstractC3718y2.m8765f(1, "gads:h5ads:max_gmsg_length", 5000);
        f14183E5 = AbstractC3718y2.m8768i(1, "gads:h5ads:afma_prefix", "(window.AFMA_ReceiveMessage || window.h5_iframe.contentWindow.AFMA_ReceiveMessage || function() {})");
    }

    /* JADX INFO: renamed from: a */
    public static void m6922a(final Context context) {
        C2622l.m5238D0(new ls1(context) { // from class: c.n.b.d.j.a.f3

            /* JADX INFO: renamed from: a */
            public final Context f13780a;

            {
                this.f13780a = context;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.ls1
            public final Object zza() {
                Context context2 = this.f13780a;
                AbstractC3718y2<String> abstractC3718y2 = C3052g3.f14310a;
                SharedPreferencesOnSharedPreferenceChangeListenerC2978e3 sharedPreferencesOnSharedPreferenceChangeListenerC2978e3 = C2862b.f12493a.f12496d;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC2978e3.f13468c) {
                    return null;
                }
                synchronized (sharedPreferencesOnSharedPreferenceChangeListenerC2978e3.f13466a) {
                    if (sharedPreferencesOnSharedPreferenceChangeListenerC2978e3.f13468c) {
                        return null;
                    }
                    if (!sharedPreferencesOnSharedPreferenceChangeListenerC2978e3.f13469d) {
                        sharedPreferencesOnSharedPreferenceChangeListenerC2978e3.f13469d = true;
                    }
                    Context applicationContext = context2.getApplicationContext() == null ? context2 : context2.getApplicationContext();
                    sharedPreferencesOnSharedPreferenceChangeListenerC2978e3.f13472g = applicationContext;
                    try {
                        sharedPreferencesOnSharedPreferenceChangeListenerC2978e3.f13471f = C2794c.m5637a(applicationContext).m5633a(sharedPreferencesOnSharedPreferenceChangeListenerC2978e3.f13472g.getPackageName(), 128).metaData;
                    } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                    }
                    try {
                        Context contextM5215a = C2618j.m5215a(context2);
                        if (contextM5215a != null || (contextM5215a = context2.getApplicationContext()) != null) {
                            context2 = contextM5215a;
                        }
                        C2829a3 c2829a3 = C2862b.f12493a.f12495c;
                        SharedPreferences sharedPreferences = context2.getSharedPreferences("google_ads_flags", 0);
                        sharedPreferencesOnSharedPreferenceChangeListenerC2978e3.f13470e = sharedPreferences;
                        if (sharedPreferences != null) {
                            sharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC2978e3);
                        }
                        C2943d5.f13175a.set(new C2941d3(sharedPreferencesOnSharedPreferenceChangeListenerC2978e3));
                        sharedPreferencesOnSharedPreferenceChangeListenerC2978e3.m6597b();
                        sharedPreferencesOnSharedPreferenceChangeListenerC2978e3.f13468c = true;
                        sharedPreferencesOnSharedPreferenceChangeListenerC2978e3.f13469d = false;
                        sharedPreferencesOnSharedPreferenceChangeListenerC2978e3.f13467b.open();
                        return null;
                    } catch (Throwable th) {
                        sharedPreferencesOnSharedPreferenceChangeListenerC2978e3.f13469d = false;
                        sharedPreferencesOnSharedPreferenceChangeListenerC2978e3.f13467b.open();
                        throw th;
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static List<String> m6923b() {
        return C2862b.f12493a.f12494b.m8843a();
    }

    /* JADX INFO: renamed from: c */
    public static List<String> m6924c() {
        C3755z2 c3755z2 = C2862b.f12493a.f12494b;
        List<String> listM8843a = c3755z2.m8843a();
        Iterator<AbstractC3718y2<String>> it = c3755z2.f22158c.iterator();
        while (it.hasNext()) {
            String str = (String) C2862b.f12493a.f12496d.m6596a(it.next());
            if (!TextUtils.isEmpty(str)) {
                ((ArrayList) listM8843a).add(str);
            }
        }
        ArrayList arrayList = new ArrayList();
        C2622l.m5230B2(arrayList, C3720y4.f21740a);
        ((ArrayList) listM8843a).addAll(arrayList);
        return listM8843a;
    }
}
