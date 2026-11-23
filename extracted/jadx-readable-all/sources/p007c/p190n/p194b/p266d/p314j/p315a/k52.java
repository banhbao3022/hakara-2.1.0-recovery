package p007c.p190n.p194b.p266d.p314j.p315a;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class k52 implements gw1 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f15886a = new byte[0];

    /* JADX INFO: renamed from: b */
    public final n52 f15887b;

    /* JADX INFO: renamed from: c */
    public final String f15888c;

    /* JADX INFO: renamed from: d */
    public final byte[] f15889d;

    /* JADX INFO: renamed from: e */
    public final i52 f15890e;

    /* JADX INFO: renamed from: f */
    public final int f15891f;

    public k52(ECPublicKey eCPublicKey, byte[] bArr, String str, int i, i52 i52Var) throws GeneralSecurityException {
        C2622l.m5361e1(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f15887b = new n52(eCPublicKey);
        this.f15889d = bArr;
        this.f15888c = str;
        this.f15891f = i;
        this.f15890e = i52Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gw1
    /* JADX INFO: renamed from: a */
    public final byte[] mo6126a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        char c2;
        byte[] bArr3;
        char c3;
        int i;
        byte[] bArrDoFinal;
        ez1 ez1Var;
        boolean z;
        byte[] bArr4;
        n52 n52Var = this.f15887b;
        String str = this.f15888c;
        byte[] bArr5 = this.f15889d;
        int i2 = ((dz1) this.f15890e).f13442b;
        int i3 = this.f15891f;
        ECParameterSpec params = n52Var.f17028a.getParams();
        KeyPairGenerator keyPairGeneratorM8079a = p52.f17859f.m8079a("EC");
        keyPairGeneratorM8079a.initialize(params);
        KeyPair keyPairGenerateKeyPair = keyPairGeneratorM8079a.generateKeyPair();
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairGenerateKeyPair.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairGenerateKeyPair.getPrivate();
        ECPublicKey eCPublicKey2 = n52Var.f17028a;
        try {
            ECParameterSpec params2 = eCPublicKey2.getParams();
            ECParameterSpec params3 = eCPrivateKey.getParams();
            if (!params2.getCurve().equals(params3.getCurve()) || !params2.getGenerator().equals(params3.getGenerator()) || !params2.getOrder().equals(params3.getOrder()) || params2.getCofactor() != params3.getCofactor()) {
                throw new GeneralSecurityException("invalid public key spec");
            }
            ECPoint w = eCPublicKey2.getW();
            C2622l.m5361e1(w, eCPrivateKey.getParams().getCurve());
            PublicKey publicKeyGeneratePublic = p52.f17860g.m8079a("EC").generatePublic(new ECPublicKeySpec(w, eCPrivateKey.getParams()));
            KeyAgreement keyAgreementM8079a = p52.f17858e.m8079a("ECDH");
            keyAgreementM8079a.init(eCPrivateKey);
            try {
                keyAgreementM8079a.doPhase(publicKeyGeneratePublic, true);
                byte[] bArrGenerateSecret = keyAgreementM8079a.generateSecret();
                EllipticCurve curve = eCPrivateKey.getParams().getCurve();
                BigInteger bigInteger = new BigInteger(1, bArrGenerateSecret);
                if (bigInteger.signum() == -1 || bigInteger.compareTo(C2622l.m5301Q1(curve)) >= 0) {
                    throw new GeneralSecurityException("shared secret is out of range");
                }
                BigInteger bigIntegerM5301Q1 = C2622l.m5301Q1(curve);
                BigInteger bigIntegerMod = bigInteger.multiply(bigInteger).add(curve.getA()).multiply(bigInteger).add(curve.getB()).mod(bigIntegerM5301Q1);
                if (bigIntegerM5301Q1.signum() != 1) {
                    throw new InvalidAlgorithmParameterException("p must be positive");
                }
                BigInteger bigIntegerMod2 = bigIntegerMod.mod(bigIntegerM5301Q1);
                BigInteger bigIntegerAdd = BigInteger.ZERO;
                if (!bigIntegerMod2.equals(bigIntegerAdd)) {
                    BigInteger bigIntegerMod3 = null;
                    if (bigIntegerM5301Q1.testBit(0) && bigIntegerM5301Q1.testBit(1)) {
                        bigIntegerAdd = bigIntegerMod2.modPow(bigIntegerM5301Q1.add(BigInteger.ONE).shiftRight(2), bigIntegerM5301Q1);
                    } else {
                        if (bigIntegerM5301Q1.testBit(0) && !bigIntegerM5301Q1.testBit(1)) {
                            bigIntegerAdd = BigInteger.ONE;
                            BigInteger bigIntegerShiftRight = bigIntegerM5301Q1.subtract(bigIntegerAdd).shiftRight(1);
                            int i4 = 0;
                            while (true) {
                                BigInteger bigIntegerMod4 = bigIntegerAdd.multiply(bigIntegerAdd).subtract(bigIntegerMod2).mod(bigIntegerM5301Q1);
                                if (!bigIntegerMod4.equals(BigInteger.ZERO)) {
                                    BigInteger bigIntegerModPow = bigIntegerMod4.modPow(bigIntegerShiftRight, bigIntegerM5301Q1);
                                    BigInteger bigIntegerMod5 = BigInteger.ONE;
                                    if (bigIntegerModPow.add(bigIntegerMod5).equals(bigIntegerM5301Q1)) {
                                        BigInteger bigIntegerShiftRight2 = bigIntegerM5301Q1.add(bigIntegerMod5).shiftRight(1);
                                        int iBitLength = bigIntegerShiftRight2.bitLength() - 2;
                                        bigIntegerMod3 = bigIntegerAdd;
                                        while (iBitLength >= 0) {
                                            BigInteger bigIntegerMultiply = bigIntegerMod3.multiply(bigIntegerMod5);
                                            bigIntegerMod3 = bigIntegerMod3.multiply(bigIntegerMod3).add(bigIntegerMod5.multiply(bigIntegerMod5).mod(bigIntegerM5301Q1).multiply(bigIntegerMod4)).mod(bigIntegerM5301Q1);
                                            BigInteger bigIntegerMod6 = bigIntegerMultiply.add(bigIntegerMultiply).mod(bigIntegerM5301Q1);
                                            if (bigIntegerShiftRight2.testBit(iBitLength)) {
                                                BigInteger bigIntegerMod7 = bigIntegerMod3.multiply(bigIntegerAdd).add(bigIntegerMod6.multiply(bigIntegerMod4)).mod(bigIntegerM5301Q1);
                                                bigIntegerMod5 = bigIntegerAdd.multiply(bigIntegerMod6).add(bigIntegerMod3).mod(bigIntegerM5301Q1);
                                                bigIntegerMod3 = bigIntegerMod7;
                                            } else {
                                                bigIntegerMod5 = bigIntegerMod6;
                                            }
                                            iBitLength--;
                                            bigIntegerShiftRight2 = bigIntegerShiftRight2;
                                        }
                                    } else {
                                        if (!bigIntegerModPow.equals(bigIntegerMod5)) {
                                            throw new InvalidAlgorithmParameterException("p is not prime");
                                        }
                                        bigIntegerAdd = bigIntegerAdd.add(bigIntegerMod5);
                                        int i5 = i4 + 1;
                                        if (i5 == 128 && !bigIntegerM5301Q1.isProbablePrime(80)) {
                                            throw new InvalidAlgorithmParameterException("p is not prime");
                                        }
                                        i4 = i5;
                                    }
                                }
                            }
                        }
                        bigIntegerAdd = bigIntegerMod3;
                    }
                    if (bigIntegerAdd != null && bigIntegerAdd.multiply(bigIntegerAdd).mod(bigIntegerM5301Q1).compareTo(bigIntegerMod2) != 0) {
                        throw new GeneralSecurityException("Could not find a modular square root");
                    }
                }
                if (!bigIntegerAdd.testBit(0)) {
                    bigIntegerM5301Q1.subtract(bigIntegerAdd).mod(bigIntegerM5301Q1);
                }
                EllipticCurve curve2 = eCPublicKey.getParams().getCurve();
                ECPoint w2 = eCPublicKey.getW();
                C2622l.m5361e1(w2, curve2);
                int iBitLength2 = (C2622l.m5301Q1(curve2).subtract(BigInteger.ONE).bitLength() + 7) / 8;
                int i6 = i3 - 1;
                if (i6 != 0) {
                    if (i6 != 2) {
                        int i7 = iBitLength2 + 1;
                        bArr4 = new byte[i7];
                        byte[] byteArray = w2.getAffineX().toByteArray();
                        int length = byteArray.length;
                        System.arraycopy(byteArray, 0, bArr4, i7 - length, length);
                        bArr4[0] = true != w2.getAffineY().testBit(0) ? (byte) 2 : (byte) 3;
                    } else {
                        int i8 = iBitLength2 + iBitLength2;
                        bArr4 = new byte[i8];
                        byte[] byteArray2 = w2.getAffineX().toByteArray();
                        int length2 = byteArray2.length;
                        if (length2 > iBitLength2) {
                            byteArray2 = Arrays.copyOfRange(byteArray2, length2 - iBitLength2, length2);
                        }
                        byte[] byteArray3 = w2.getAffineY().toByteArray();
                        int length3 = byteArray3.length;
                        if (length3 > iBitLength2) {
                            byteArray3 = Arrays.copyOfRange(byteArray3, length3 - iBitLength2, length3);
                        }
                        int length4 = byteArray3.length;
                        System.arraycopy(byteArray3, 0, bArr4, i8 - length4, length4);
                        int length5 = byteArray2.length;
                        System.arraycopy(byteArray2, 0, bArr4, iBitLength2 - length5, length5);
                    }
                    bArr3 = bArr4;
                    i = 2;
                    c2 = 1;
                    c3 = 0;
                } else {
                    c2 = 1;
                    int i9 = iBitLength2 + iBitLength2 + 1;
                    bArr3 = new byte[i9];
                    byte[] byteArray4 = w2.getAffineX().toByteArray();
                    byte[] byteArray5 = w2.getAffineY().toByteArray();
                    int length6 = byteArray5.length;
                    c3 = 0;
                    System.arraycopy(byteArray5, 0, bArr3, i9 - length6, length6);
                    int length7 = byteArray4.length;
                    System.arraycopy(byteArray4, 0, bArr3, (iBitLength2 + 1) - length7, length7);
                    bArr3[0] = 4;
                    i = 2;
                }
                byte[][] bArr6 = new byte[i][];
                bArr6[c3] = bArr3;
                bArr6[c2] = bArrGenerateSecret;
                byte[] bArrM5416p1 = C2622l.m5416p1(bArr6);
                Mac macM8079a = p52.f17857d.m8079a(str);
                if (i2 > macM8079a.getMacLength() * 255) {
                    throw new GeneralSecurityException("size too large");
                }
                if (bArr5 == null || bArr5.length == 0) {
                    macM8079a.init(new SecretKeySpec(new byte[macM8079a.getMacLength()], str));
                } else {
                    macM8079a.init(new SecretKeySpec(bArr5, str));
                }
                byte[] bArr7 = new byte[i2];
                macM8079a.init(new SecretKeySpec(macM8079a.doFinal(bArrM5416p1), str));
                byte[] bArr8 = new byte[0];
                int i10 = 0;
                int i11 = 1;
                while (true) {
                    macM8079a.update(bArr8);
                    macM8079a.update(bArr2);
                    macM8079a.update((byte) i11);
                    bArrDoFinal = macM8079a.doFinal();
                    int length8 = bArrDoFinal.length;
                    int i12 = i10 + length8;
                    if (i12 >= i2) {
                        break;
                    }
                    System.arraycopy(bArrDoFinal, 0, bArr7, i10, length8);
                    i11++;
                    bArr8 = bArrDoFinal;
                    i10 = i12;
                }
                System.arraycopy(bArrDoFinal, 0, bArr7, i10, i2 - i10);
                m52 m52Var = new m52(bArr3, bArr7);
                i52 i52Var = this.f15890e;
                byte[] bArr9 = m52Var.f16685b.f21745a;
                int length9 = bArr9.length;
                byte[] bArr10 = new byte[length9];
                System.arraycopy(bArr9, 0, bArr10, 0, length9);
                dz1 dz1Var = (dz1) i52Var;
                Objects.requireNonNull(dz1Var);
                if (length9 != dz1Var.f13442b) {
                    throw new GeneralSecurityException("Symmetric key has incorrect length");
                }
                if (dz1Var.f13441a.equals(ex1.f13747b)) {
                    z02 z02VarM5662z = a12.m5662z();
                    z02VarM5662z.m6301p(dz1Var.f13443c);
                    g72 g72VarM6939G = g72.m6939G(bArr10, 0, dz1Var.f13442b);
                    if (z02VarM5662z.f13191h) {
                        z02VarM5662z.m6298m();
                        z02VarM5662z.f13191h = false;
                    }
                    ((a12) z02VarM5662z.f13190g).zze = g72VarM6939G;
                    ez1Var = new ez1((bw1) cx1.m6263g(dz1Var.f13441a, z02VarM5662z.m6300o(), bw1.class));
                } else if (dz1Var.f13441a.equals(ex1.f13746a)) {
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr10, 0, dz1Var.f13445e);
                    byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr10, dz1Var.f13445e, dz1Var.f13442b);
                    g02 g02VarM7043A = h02.m7043A();
                    g02VarM7043A.m6301p(dz1Var.f13444d.m5906x());
                    g72 g72VarM6940H = g72.m6940H(bArrCopyOfRange);
                    if (g02VarM7043A.f13191h) {
                        g02VarM7043A.m6298m();
                        g02VarM7043A.f13191h = false;
                    }
                    ((h02) g02VarM7043A.f13190g).zzf = g72VarM6940H;
                    h02 h02VarM6300o = g02VarM7043A.m6300o();
                    u22 u22VarM8527A = v22.m8527A();
                    u22VarM8527A.m6301p(dz1Var.f13444d.m5907y());
                    g72 g72VarM6940H2 = g72.m6940H(bArrCopyOfRange2);
                    if (u22VarM8527A.f13191h) {
                        u22VarM8527A.m6298m();
                        u22VarM8527A.f13191h = false;
                    }
                    ((v22) u22VarM8527A.f13190g).zzf = g72VarM6940H2;
                    v22 v22VarM6300o = u22VarM8527A.m6300o();
                    a02 a02VarM5899A = b02.m5899A();
                    int iM5905v = dz1Var.f13444d.m5905v();
                    if (a02VarM5899A.f13191h) {
                        a02VarM5899A.m6298m();
                        z = false;
                        a02VarM5899A.f13191h = false;
                    } else {
                        z = false;
                    }
                    ((b02) a02VarM5899A.f13190g).zzb = iM5905v;
                    if (a02VarM5899A.f13191h) {
                        a02VarM5899A.m6298m();
                        a02VarM5899A.f13191h = z;
                    }
                    b02.m5902D((b02) a02VarM5899A.f13190g, h02VarM6300o);
                    if (a02VarM5899A.f13191h) {
                        a02VarM5899A.m6298m();
                        a02VarM5899A.f13191h = z;
                    }
                    b02.m5903E((b02) a02VarM5899A.f13190g, v22VarM6300o);
                    ez1Var = new ez1((bw1) cx1.m6263g(dz1Var.f13441a, a02VarM5899A.m6300o(), bw1.class));
                } else {
                    if (!dz1Var.f13441a.equals(qy1.f18666a)) {
                        throw new GeneralSecurityException("unknown DEM key type");
                    }
                    m12 m12VarM7754z = n12.m7754z();
                    m12VarM7754z.m6301p(dz1Var.f13446f);
                    g72 g72VarM6939G2 = g72.m6939G(bArr10, 0, dz1Var.f13442b);
                    if (m12VarM7754z.f13191h) {
                        m12VarM7754z.m6298m();
                        m12VarM7754z.f13191h = false;
                    }
                    ((n12) m12VarM7754z.f13190g).zze = g72VarM6939G2;
                    ez1Var = new ez1((ew1) cx1.m6263g(dz1Var.f13441a, m12VarM7754z.m6300o(), ew1.class));
                }
                byte[] bArr11 = f15886a;
                bw1 bw1Var = ez1Var.f13768a;
                byte[] bArrMo5927a = bw1Var != null ? bw1Var.mo5927a(bArr, bArr11) : ez1Var.f13769b.mo6147a(bArr, bArr11);
                byte[] bArr12 = m52Var.f16684a.f21745a;
                int length10 = bArr12.length;
                byte[] bArr13 = new byte[length10];
                System.arraycopy(bArr12, 0, bArr13, 0, length10);
                return ByteBuffer.allocate(length10 + bArrMo5927a.length).put(bArr13).put(bArrMo5927a).array();
            } catch (IllegalStateException e) {
                throw new GeneralSecurityException(e.toString());
            }
        } catch (IllegalArgumentException | NullPointerException e2) {
            throw new GeneralSecurityException(e2.toString());
        }
    }
}
