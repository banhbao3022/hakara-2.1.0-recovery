package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import p007c.p085g.p086a.p089m.p092t.p093c0.ArrayPool;
import p007c.p085g.p086a.p089m.p098v.p103h.GifBitmapProvider;

/* JADX INFO: renamed from: c.g.a.l.e, reason: use source file name */
/* JADX INFO: compiled from: StandardGifDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public class StandardGifDecoder implements GifDecoder {

    /* JADX INFO: renamed from: a */
    public static final String f2993a = "e";

    /* JADX INFO: renamed from: b */
    public int[] f2994b;

    /* JADX INFO: renamed from: c */
    public final int[] f2995c;

    /* JADX INFO: renamed from: d */
    public final GifDecoder.BitmapProvider f2996d;

    /* JADX INFO: renamed from: e */
    public ByteBuffer f2997e;

    /* JADX INFO: renamed from: f */
    public byte[] f2998f;

    /* JADX INFO: renamed from: g */
    public short[] f2999g;

    /* JADX INFO: renamed from: h */
    public byte[] f3000h;

    /* JADX INFO: renamed from: i */
    public byte[] f3001i;

    /* JADX INFO: renamed from: j */
    public byte[] f3002j;

    /* JADX INFO: renamed from: k */
    public int[] f3003k;

    /* JADX INFO: renamed from: l */
    public int f3004l;

    /* JADX INFO: renamed from: m */
    public GifHeader f3005m;

    /* JADX INFO: renamed from: n */
    public Bitmap f3006n;

    /* JADX INFO: renamed from: o */
    public boolean f3007o;

    /* JADX INFO: renamed from: p */
    public int f3008p;

    /* JADX INFO: renamed from: q */
    public int f3009q;

    /* JADX INFO: renamed from: r */
    public int f3010r;

    /* JADX INFO: renamed from: s */
    public int f3011s;

    /* JADX INFO: renamed from: t */
    public Boolean f3012t;

    /* JADX INFO: renamed from: u */
    public Bitmap.Config f3013u;

    public StandardGifDecoder(GifDecoder.BitmapProvider bitmapProvider, GifHeader gifHeader, ByteBuffer byteBuffer) {
        this(bitmapProvider, gifHeader, byteBuffer, 1);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    /* JADX INFO: renamed from: a */
    public synchronized Bitmap getNextFrame() {
        if (this.f3005m.f2980c <= 0 || this.f3004l < 0) {
            String str = f2993a;
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Unable to decode frame, frameCount=" + this.f3005m.f2980c + ", framePointer=" + this.f3004l);
            }
            this.f3008p = 1;
        }
        int i = this.f3008p;
        if (i != 1 && i != 2) {
            this.f3008p = 0;
            if (this.f2998f == null) {
                this.f2998f = ((GifBitmapProvider) this.f2996d).m1923a(255);
            }
            GifFrame gifFrame = this.f3005m.f2982e.get(this.f3004l);
            int i2 = this.f3004l - 1;
            GifFrame gifFrame2 = i2 >= 0 ? this.f3005m.f2982e.get(i2) : null;
            int[] iArr = gifFrame.f2977k;
            if (iArr == null) {
                iArr = this.f3005m.f2978a;
            }
            this.f2994b = iArr;
            if (iArr == null) {
                String str2 = f2993a;
                if (Log.isLoggable(str2, 3)) {
                    Log.d(str2, "No valid color table found for frame #" + this.f3004l);
                }
                this.f3008p = 1;
                return null;
            }
            if (gifFrame.f2972f) {
                System.arraycopy(iArr, 0, this.f2995c, 0, iArr.length);
                int[] iArr2 = this.f2995c;
                this.f2994b = iArr2;
                iArr2[gifFrame.f2974h] = 0;
                if (gifFrame.f2973g == 2 && this.f3004l == 0) {
                    this.f3012t = Boolean.TRUE;
                }
            }
            return setPixels(gifFrame, gifFrame2);
        }
        String str3 = f2993a;
        if (Log.isLoggable(str3, 3)) {
            Log.d(str3, "Unable to decode frame, status=" + this.f3008p);
        }
        return null;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    /* JADX INFO: renamed from: b */
    public void advance() {
        this.f3004l = (this.f3004l + 1) % this.f3005m.f2980c;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    /* JADX INFO: renamed from: c */
    public int getFrameCount() {
        return this.f3005m.f2980c;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void clear() {
        ArrayPool arrayPool;
        ArrayPool arrayPool2;
        ArrayPool arrayPool3;
        this.f3005m = null;
        byte[] bArr = this.f3002j;
        if (bArr != null && (arrayPool3 = ((GifBitmapProvider) this.f2996d).f3617b) != null) {
            arrayPool3.mo1744d(bArr);
        }
        int[] iArr = this.f3003k;
        if (iArr != null && (arrayPool2 = ((GifBitmapProvider) this.f2996d).f3617b) != null) {
            arrayPool2.mo1744d(iArr);
        }
        Bitmap bitmap = this.f3006n;
        if (bitmap != null) {
            ((GifBitmapProvider) this.f2996d).f3616a.mo1752d(bitmap);
        }
        this.f3006n = null;
        this.f2997e = null;
        this.f3012t = null;
        byte[] bArr2 = this.f2998f;
        if (bArr2 == null || (arrayPool = ((GifBitmapProvider) this.f2996d).f3617b) == null) {
            return;
        }
        arrayPool.mo1744d(bArr2);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    /* JADX INFO: renamed from: d */
    public int getNextDelay() {
        int i;
        GifHeader gifHeader = this.f3005m;
        int i2 = gifHeader.f2980c;
        if (i2 <= 0 || (i = this.f3004l) < 0) {
            return 0;
        }
        if (i < 0 || i >= i2) {
            return -1;
        }
        return gifHeader.f2982e.get(i).f2975i;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    /* JADX INFO: renamed from: e */
    public ByteBuffer getData() {
        return this.f2997e;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    /* JADX INFO: renamed from: f */
    public int getCurrentFrameIndex() {
        return this.f3004l;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    /* JADX INFO: renamed from: g */
    public int getByteSize() {
        return (this.f3003k.length * 4) + this.f2997e.limit() + this.f3002j.length;
    }

    /* JADX INFO: renamed from: h */
    public final Bitmap getNextBitmap() {
        Boolean bool = this.f3012t;
        Bitmap.Config config = (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f3013u;
        Bitmap bitmapMo1751c = ((GifBitmapProvider) this.f2996d).f3616a.mo1751c(this.f3011s, this.f3010r, config);
        bitmapMo1751c.setHasAlpha(true);
        return bitmapMo1751c;
    }

    /* JADX INFO: renamed from: i */
    public void setDefaultBitmapConfig(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f3013u = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v30, types: [short] */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX INFO: renamed from: j */
    public final Bitmap setPixels(GifFrame gifFrame, GifFrame gifFrame2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        short s;
        int i9;
        int i10;
        Bitmap bitmap;
        int i11;
        int[] iArr = this.f3003k;
        if (gifFrame2 == null) {
            Bitmap bitmap2 = this.f3006n;
            if (bitmap2 != null) {
                ((GifBitmapProvider) this.f2996d).f3616a.mo1752d(bitmap2);
            }
            this.f3006n = null;
            Arrays.fill(iArr, 0);
        }
        if (gifFrame2 != null && gifFrame2.f2973g == 3 && this.f3006n == null) {
            Arrays.fill(iArr, 0);
        }
        if (gifFrame2 != null && (i10 = gifFrame2.f2973g) > 0) {
            if (i10 == 2) {
                if (gifFrame.f2972f) {
                    i11 = 0;
                } else {
                    GifHeader gifHeader = this.f3005m;
                    i11 = gifHeader.f2988k;
                    if (gifFrame.f2977k != null && gifHeader.f2987j == gifFrame.f2974h) {
                        i11 = 0;
                    }
                }
                int i12 = gifFrame2.f2970d;
                int i13 = this.f3009q;
                int i14 = i12 / i13;
                int i15 = gifFrame2.f2968b / i13;
                int i16 = gifFrame2.f2969c / i13;
                int i17 = gifFrame2.f2967a / i13;
                int i18 = this.f3011s;
                int i19 = (i15 * i18) + i17;
                int i20 = (i14 * i18) + i19;
                while (i19 < i20) {
                    int i21 = i19 + i16;
                    for (int i22 = i19; i22 < i21; i22++) {
                        iArr[i22] = i11;
                    }
                    i19 += this.f3011s;
                }
            } else if (i10 == 3 && (bitmap = this.f3006n) != null) {
                int i23 = this.f3011s;
                bitmap.getPixels(iArr, 0, i23, 0, 0, i23, this.f3010r);
            }
        }
        this.f2997e.position(gifFrame.f2976j);
        int i24 = gifFrame.f2969c * gifFrame.f2970d;
        byte[] bArr = this.f3002j;
        if (bArr == null || bArr.length < i24) {
            this.f3002j = ((GifBitmapProvider) this.f2996d).m1923a(i24);
        }
        byte[] bArr2 = this.f3002j;
        if (this.f2999g == null) {
            this.f2999g = new short[4096];
        }
        short[] sArr = this.f2999g;
        if (this.f3000h == null) {
            this.f3000h = new byte[4096];
        }
        byte[] bArr3 = this.f3000h;
        if (this.f3001i == null) {
            this.f3001i = new byte[4097];
        }
        byte[] bArr4 = this.f3001i;
        int i25 = this.f2997e.get() & 255;
        int i26 = 1 << i25;
        int i27 = i26 + 1;
        int i28 = i26 + 2;
        int i29 = i25 + 1;
        int i30 = (1 << i29) - 1;
        for (int i31 = 0; i31 < i26; i31++) {
            sArr[i31] = 0;
            bArr3[i31] = (byte) i31;
        }
        byte[] bArr5 = this.f2998f;
        StandardGifDecoder standardGifDecoder = this;
        int i32 = i29;
        int i33 = i28;
        int i34 = i30;
        int i35 = 0;
        int i36 = -1;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = 0;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        while (true) {
            if (i35 >= i24) {
                iArr = iArr;
                break;
            }
            if (i37 == 0) {
                int i44 = standardGifDecoder.f2997e.get() & 255;
                if (i44 > 0) {
                    ByteBuffer byteBuffer = standardGifDecoder.f2997e;
                    byteBuffer.get(standardGifDecoder.f2998f, 0, Math.min(i44, byteBuffer.remaining()));
                }
                if (i44 <= 0) {
                    standardGifDecoder.f3008p = 3;
                    break;
                }
                i37 = i44;
                i38 = 0;
            } else {
                i29 = i29;
                i35 = i35;
                iArr = iArr;
                i36 = i36;
            }
            i40 += (bArr5[i38] & 255) << i39;
            i38++;
            i37--;
            int i45 = i39 + 8;
            int i46 = i33;
            int i47 = i32;
            i35 = i35;
            i36 = i36;
            byte[] bArr6 = bArr5;
            int i48 = i41;
            while (true) {
                if (i45 < i47) {
                    standardGifDecoder = this;
                    break;
                }
                StandardGifDecoder standardGifDecoder2 = standardGifDecoder;
                int i49 = i40 & i34;
                i40 >>= i47;
                i45 -= i47;
                if (i49 == i26) {
                    i46 = i28;
                    i34 = i30;
                    standardGifDecoder = standardGifDecoder2;
                    i47 = i29;
                    i36 = -1;
                    i9 = i48;
                } else {
                    if (i49 == i27) {
                        standardGifDecoder = standardGifDecoder2;
                        break;
                    }
                    if (i36 == -1) {
                        bArr2[i42] = bArr3[i49];
                        i42++;
                        i35++;
                        i9 = i49;
                    } else {
                        if (i49 >= i46) {
                            bArr4[i43] = (byte) i48;
                            i43++;
                            s = i36;
                        } else {
                            s = i49;
                        }
                        while (s >= i26) {
                            bArr4[i43] = bArr3[s];
                            i43++;
                            s = sArr[s];
                        }
                        int i50 = bArr3[s] & 255;
                        byte b = (byte) i50;
                        bArr2[i42] = b;
                        while (true) {
                            i42++;
                            i35++;
                            if (i43 <= 0) {
                                break;
                            }
                            i43--;
                            bArr2[i42] = bArr4[i43];
                        }
                        i9 = i50;
                        if (i46 < 4096) {
                            sArr[i46] = (short) i36;
                            bArr3[i46] = b;
                            i46++;
                            if ((i46 & i34) == 0 && i46 < 4096) {
                                i47++;
                                i34 += i46;
                            }
                        }
                    }
                    i36 = i49;
                    standardGifDecoder = this;
                }
                i48 = i9;
                i45 = i45;
            }
            i32 = i47;
            bArr5 = bArr6;
            i41 = i48;
            i29 = i29;
            i39 = i45;
            i33 = i46;
            iArr = iArr;
        }
        Arrays.fill(bArr2, i42, i24, (byte) 0);
        if (gifFrame.f2971e || this.f3009q != 1) {
            int[] iArr2 = this.f3003k;
            int i51 = gifFrame.f2970d;
            int i52 = this.f3009q;
            int i53 = i51 / i52;
            int i54 = gifFrame.f2968b / i52;
            int i55 = gifFrame.f2969c / i52;
            int i56 = gifFrame.f2967a / i52;
            boolean z = this.f3004l == 0;
            int i57 = this.f3011s;
            int i58 = this.f3010r;
            byte[] bArr7 = this.f3002j;
            int[] iArr3 = this.f2994b;
            Boolean bool = this.f3012t;
            int i59 = 0;
            int i60 = 0;
            int i61 = 1;
            int i62 = 8;
            while (i59 < i53) {
                Boolean bool2 = bool;
                if (gifFrame.f2971e) {
                    if (i60 >= i53) {
                        int i63 = i61 + 1;
                        i = i53;
                        if (i63 == 2) {
                            i61 = i63;
                            i60 = 4;
                        } else if (i63 != 3) {
                            i61 = i63;
                            if (i63 == 4) {
                                i60 = 1;
                                i62 = 2;
                            }
                        } else {
                            i61 = i63;
                            i60 = 2;
                            i62 = 4;
                        }
                    } else {
                        i = i53;
                    }
                    i2 = i60 + i62;
                } else {
                    i = i53;
                    i2 = i60;
                    i60 = i59;
                }
                int i64 = i60 + i54;
                boolean z2 = i52 == 1;
                if (i64 < i58) {
                    int i65 = i64 * i57;
                    int i66 = i65 + i56;
                    int i67 = i66 + i55;
                    int i68 = i65 + i57;
                    if (i68 < i67) {
                        i67 = i68;
                    }
                    int i69 = i59 * i52 * gifFrame.f2969c;
                    if (z2) {
                        bool = bool2;
                        int i70 = i66;
                        while (true) {
                            i3 = i55;
                            if (i70 >= i67) {
                                break;
                            }
                            int i71 = iArr3[bArr7[i69] & 255];
                            if (i71 != 0) {
                                iArr2[i70] = i71;
                            } else if (z && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i69 += i52;
                            i70++;
                            i55 = i3;
                        }
                    } else {
                        i3 = i55;
                        int i72 = ((i67 - i66) * i52) + i69;
                        bool = bool2;
                        int i73 = i66;
                        while (i73 < i67) {
                            int i74 = i67;
                            int i75 = gifFrame.f2969c;
                            int i76 = i56;
                            int i77 = i57;
                            int i78 = i69;
                            int i79 = 0;
                            int i80 = 0;
                            int i81 = 0;
                            int i82 = 0;
                            int i83 = 0;
                            while (true) {
                                if (i78 >= this.f3009q + i69) {
                                    i7 = i58;
                                    break;
                                }
                                byte[] bArr8 = this.f3002j;
                                i7 = i58;
                                if (i78 >= bArr8.length || i78 >= i72) {
                                    break;
                                }
                                int i84 = this.f2994b[bArr8[i78] & 255];
                                if (i84 != 0) {
                                    i79 += (i84 >> 24) & 255;
                                    i80 += (i84 >> 16) & 255;
                                    i81 += (i84 >> 8) & 255;
                                    i82 += i84 & 255;
                                    i83++;
                                }
                                i78++;
                                i58 = i7;
                            }
                            int i85 = i75 + i69;
                            for (int i86 = i85; i86 < this.f3009q + i85; i86++) {
                                byte[] bArr9 = this.f3002j;
                                if (i86 >= bArr9.length || i86 >= i72) {
                                    break;
                                }
                                int i87 = this.f2994b[bArr9[i86] & 255];
                                if (i87 != 0) {
                                    i79 += (i87 >> 24) & 255;
                                    i80 += (i87 >> 16) & 255;
                                    i81 += (i87 >> 8) & 255;
                                    i82 += i87 & 255;
                                    i83++;
                                }
                            }
                            int i88 = i83 == 0 ? 0 : ((i79 / i83) << 24) | ((i80 / i83) << 16) | ((i81 / i83) << 8) | (i82 / i83);
                            if (i88 != 0) {
                                iArr2[i73] = i88;
                            } else if (z && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i69 += i52;
                            i73++;
                            i67 = i74;
                            i56 = i76;
                            i57 = i77;
                            i58 = i7;
                        }
                    }
                    i4 = i56;
                    i5 = i57;
                    i6 = i58;
                } else {
                    i3 = i55;
                    i4 = i56;
                    i5 = i57;
                    i6 = i58;
                    bool = bool2;
                }
                i59++;
                i53 = i;
                i60 = i2;
                i54 = i54;
                i55 = i3;
                i56 = i4;
                i57 = i5;
                i58 = i6;
            }
            Boolean bool3 = bool;
            if (this.f3012t == null) {
                this.f3012t = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
            }
        } else {
            int[] iArr4 = this.f3003k;
            int i89 = gifFrame.f2970d;
            int i90 = gifFrame.f2968b;
            int i91 = gifFrame.f2969c;
            int i92 = gifFrame.f2967a;
            boolean z3 = this.f3004l == 0;
            int i93 = this.f3011s;
            byte[] bArr10 = this.f3002j;
            int[] iArr5 = this.f2994b;
            byte b2 = -1;
            for (int i94 = 0; i94 < i89; i94++) {
                int i95 = (i94 + i90) * i93;
                int i96 = i95 + i92;
                int i97 = i96 + i91;
                int i98 = i95 + i93;
                if (i98 < i97) {
                    i97 = i98;
                }
                int i99 = gifFrame.f2969c * i94;
                while (i96 < i97) {
                    int i100 = i89;
                    byte b3 = bArr10[i99];
                    int i101 = i90;
                    int i102 = b3 & 255;
                    if (i102 != b2) {
                        int i103 = iArr5[i102];
                        if (i103 != 0) {
                            iArr4[i96] = i103;
                        } else {
                            b2 = b3;
                        }
                    }
                    i99++;
                    i96++;
                    i89 = i100;
                    i90 = i101;
                }
            }
            Boolean bool4 = this.f3012t;
            this.f3012t = Boolean.valueOf((bool4 != null && bool4.booleanValue()) || (this.f3012t == null && z3 && b2 != -1));
        }
        if (this.f3007o && ((i8 = gifFrame.f2973g) == 0 || i8 == 1)) {
            if (this.f3006n == null) {
                this.f3006n = getNextBitmap();
            }
            Bitmap bitmap3 = this.f3006n;
            int i104 = this.f3011s;
            bitmap3.setPixels(iArr, 0, i104, 0, 0, i104, this.f3010r);
        }
        Bitmap nextBitmap = getNextBitmap();
        int i105 = this.f3011s;
        nextBitmap.setPixels(iArr, 0, i105, 0, 0, i105, this.f3010r);
        return nextBitmap;
    }

    public StandardGifDecoder(GifDecoder.BitmapProvider bitmapProvider, GifHeader gifHeader, ByteBuffer byteBuffer, int i) {
        this(bitmapProvider);
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int iHighestOneBit = Integer.highestOneBit(i);
                this.f3008p = 0;
                this.f3005m = gifHeader;
                this.f3004l = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f2997e = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f2997e.order(ByteOrder.LITTLE_ENDIAN);
                this.f3007o = false;
                Iterator<GifFrame> it = gifHeader.f2982e.iterator();
                while (it.hasNext()) {
                    if (it.next().f2973g == 3) {
                        this.f3007o = true;
                        break;
                    }
                }
                this.f3009q = iHighestOneBit;
                int i2 = gifHeader.f2983f;
                this.f3011s = i2 / iHighestOneBit;
                int i3 = gifHeader.f2984g;
                this.f3010r = i3 / iHighestOneBit;
                this.f3002j = ((GifBitmapProvider) this.f2996d).m1923a(i2 * i3);
                GifDecoder.BitmapProvider bitmapProvider2 = this.f2996d;
                int i4 = this.f3011s * this.f3010r;
                ArrayPool arrayPool = ((GifBitmapProvider) bitmapProvider2).f3617b;
                this.f3003k = arrayPool == null ? new int[i4] : (int[]) arrayPool.mo1745e(i4, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public StandardGifDecoder(GifDecoder.BitmapProvider bitmapProvider) {
        this.f2995c = new int[256];
        this.f3013u = Bitmap.Config.ARGB_8888;
        this.f2996d = bitmapProvider;
        this.f3005m = new GifHeader();
    }
}
