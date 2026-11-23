package p636z0.p750o.p751a;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.o.a.a, reason: use source file name */
/* JADX INFO: compiled from: ExifInterface.java */
/* JADX INFO: loaded from: classes.dex */
public class ExifInterface {

    /* JADX INFO: renamed from: A */
    public static final HashMap<Integer, Integer> f38202A;

    /* JADX INFO: renamed from: B */
    public static final Charset f38203B;

    /* JADX INFO: renamed from: C */
    public static final byte[] f38204C;

    /* JADX INFO: renamed from: h */
    public static SimpleDateFormat f38212h;

    /* JADX INFO: renamed from: l */
    public static final c[] f38216l;

    /* JADX INFO: renamed from: m */
    public static final c[] f38217m;

    /* JADX INFO: renamed from: n */
    public static final c[] f38218n;

    /* JADX INFO: renamed from: o */
    public static final c[] f38219o;

    /* JADX INFO: renamed from: p */
    public static final c[] f38220p;

    /* JADX INFO: renamed from: q */
    public static final c f38221q;

    /* JADX INFO: renamed from: r */
    public static final c[] f38222r;

    /* JADX INFO: renamed from: s */
    public static final c[] f38223s;

    /* JADX INFO: renamed from: t */
    public static final c[] f38224t;

    /* JADX INFO: renamed from: u */
    public static final c[] f38225u;

    /* JADX INFO: renamed from: v */
    public static final c[][] f38226v;

    /* JADX INFO: renamed from: w */
    public static final c[] f38227w;

    /* JADX INFO: renamed from: x */
    public static final HashMap<Integer, c>[] f38228x;

    /* JADX INFO: renamed from: y */
    public static final HashMap<String, c>[] f38229y;

    /* JADX INFO: renamed from: z */
    public static final HashSet<String> f38230z;

    /* JADX INFO: renamed from: D */
    public final String f38231D;

    /* JADX INFO: renamed from: E */
    public final AssetManager.AssetInputStream f38232E;

    /* JADX INFO: renamed from: F */
    public int f38233F;

    /* JADX INFO: renamed from: G */
    public final HashMap<String, b>[] f38234G;

    /* JADX INFO: renamed from: H */
    public Set<Integer> f38235H;

    /* JADX INFO: renamed from: I */
    public ByteOrder f38236I;

    /* JADX INFO: renamed from: J */
    public int f38237J;

    /* JADX INFO: renamed from: K */
    public int f38238K;

    /* JADX INFO: renamed from: L */
    public int f38239L;

    /* JADX INFO: renamed from: M */
    public int f38240M;

    /* JADX INFO: renamed from: N */
    public int f38241N;

    /* JADX INFO: renamed from: O */
    public int f38242O;

    /* JADX INFO: renamed from: a */
    public static final List<Integer> f38205a = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: b */
    public static final List<Integer> f38206b = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: c */
    public static final int[] f38207c = {8, 8, 8};

    /* JADX INFO: renamed from: d */
    public static final int[] f38208d = {8};

    /* JADX INFO: renamed from: e */
    public static final byte[] f38209e = {-1, -40, -1};

    /* JADX INFO: renamed from: f */
    public static final byte[] f38210f = {79, 76, 89, 77, 80, 0};

    /* JADX INFO: renamed from: g */
    public static final byte[] f38211g = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: i */
    public static final String[] f38213i = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};

    /* JADX INFO: renamed from: j */
    public static final int[] f38214j = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* JADX INFO: renamed from: k */
    public static final byte[] f38215k = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: renamed from: z0.o.a.a$b */
    /* JADX INFO: compiled from: ExifInterface.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final int f38249a;

        /* JADX INFO: renamed from: b */
        public final int f38250b;

        /* JADX INFO: renamed from: c */
        public final byte[] f38251c;

        public b(int i, int i2, byte[] bArr) {
            this.f38249a = i;
            this.f38250b = i2;
            this.f38251c = bArr;
        }

        /* JADX INFO: renamed from: a */
        public static b m16428a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(ExifInterface.f38203B);
            return new b(2, bytes.length, bytes);
        }

        /* JADX INFO: renamed from: b */
        public static b m16429b(long j2, ByteOrder byteOrder) {
            long[] jArr = {j2};
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ExifInterface.f38214j[4] * 1]);
            byteBufferWrap.order(byteOrder);
            for (int i = 0; i < 1; i++) {
                byteBufferWrap.putInt((int) jArr[i]);
            }
            return new b(4, 1, byteBufferWrap.array());
        }

        /* JADX INFO: renamed from: c */
        public static b m16430c(d dVar, ByteOrder byteOrder) {
            d[] dVarArr = {dVar};
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ExifInterface.f38214j[5] * 1]);
            byteBufferWrap.order(byteOrder);
            for (int i = 0; i < 1; i++) {
                d dVar2 = dVarArr[i];
                byteBufferWrap.putInt((int) dVar2.f38256a);
                byteBufferWrap.putInt((int) dVar2.f38257b);
            }
            return new b(5, 1, byteBufferWrap.array());
        }

        /* JADX INFO: renamed from: d */
        public static b m16431d(int i, ByteOrder byteOrder) {
            int[] iArr = {i};
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ExifInterface.f38214j[3] * 1]);
            byteBufferWrap.order(byteOrder);
            for (int i2 = 0; i2 < 1; i2++) {
                byteBufferWrap.putShort((short) iArr[i2]);
            }
            return new b(3, 1, byteBufferWrap.array());
        }

        /* JADX INFO: renamed from: e */
        public double m16432e(ByteOrder byteOrder) throws Throwable {
            Object objM16435h = m16435h(byteOrder);
            if (objM16435h == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objM16435h instanceof String) {
                return Double.parseDouble((String) objM16435h);
            }
            if (objM16435h instanceof long[]) {
                long[] jArr = (long[]) objM16435h;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objM16435h instanceof int[]) {
                int[] iArr = (int[]) objM16435h;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objM16435h instanceof double[]) {
                double[] dArr = (double[]) objM16435h;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objM16435h instanceof d[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            d[] dVarArr = (d[]) objM16435h;
            if (dVarArr.length != 1) {
                throw new NumberFormatException("There are more than one component");
            }
            d dVar = dVarArr[0];
            return dVar.f38256a / dVar.f38257b;
        }

        /* JADX INFO: renamed from: f */
        public int m16433f(ByteOrder byteOrder) throws Throwable {
            Object objM16435h = m16435h(byteOrder);
            if (objM16435h == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objM16435h instanceof String) {
                return Integer.parseInt((String) objM16435h);
            }
            if (objM16435h instanceof long[]) {
                long[] jArr = (long[]) objM16435h;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objM16435h instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objM16435h;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        /* JADX INFO: renamed from: g */
        public String m16434g(ByteOrder byteOrder) throws Throwable {
            Object objM16435h = m16435h(byteOrder);
            if (objM16435h == null) {
                return null;
            }
            if (objM16435h instanceof String) {
                return (String) objM16435h;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (objM16435h instanceof long[]) {
                long[] jArr = (long[]) objM16435h;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objM16435h instanceof int[]) {
                int[] iArr = (int[]) objM16435h;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objM16435h instanceof double[]) {
                double[] dArr = (double[]) objM16435h;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(objM16435h instanceof d[])) {
                return null;
            }
            d[] dVarArr = (d[]) objM16435h;
            while (i < dVarArr.length) {
                sb.append(dVarArr[i].f38256a);
                sb.append('/');
                sb.append(dVarArr[i].f38257b);
                i++;
                if (i != dVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        /* JADX WARN: Code duplicated, block: B:174:0x01a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Not initialized variable reg: 3, insn: 0x019f: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:152:0x019f */
        /* JADX INFO: renamed from: h */
        public Object m16435h(ByteOrder byteOrder) throws Throwable {
            a aVar;
            InputStream inputStream;
            byte b;
            byte[] bArr;
            InputStream inputStream2 = null;
            try {
                try {
                    aVar = new a(this.f38251c);
                    try {
                        aVar.f38246i = byteOrder;
                        boolean z = true;
                        int length = 0;
                        switch (this.f38249a) {
                            case 1:
                            case 6:
                                byte[] bArr2 = this.f38251c;
                                if (bArr2.length != 1 || bArr2[0] < 0 || bArr2[0] > 1) {
                                    String str = new String(this.f38251c, ExifInterface.f38203B);
                                    try {
                                        aVar.close();
                                        break;
                                    } catch (IOException e) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                    }
                                    return str;
                                }
                                String str2 = new String(new char[]{(char) (this.f38251c[0] + 48)});
                                try {
                                    aVar.close();
                                    break;
                                } catch (IOException e2) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                }
                                return str2;
                            case 2:
                            case 7:
                                if (this.f38250b >= ExifInterface.f38215k.length) {
                                    int i = 0;
                                    while (true) {
                                        bArr = ExifInterface.f38215k;
                                        if (i < bArr.length) {
                                            if (this.f38251c[i] != bArr[i]) {
                                                z = false;
                                            } else {
                                                i++;
                                            }
                                        }
                                    }
                                    if (z) {
                                        length = bArr.length;
                                    }
                                }
                                StringBuilder sb = new StringBuilder();
                                while (length < this.f38250b && (b = this.f38251c[length]) != 0) {
                                    if (b >= 32) {
                                        sb.append((char) b);
                                    } else {
                                        sb.append('?');
                                    }
                                    length++;
                                }
                                String string = sb.toString();
                                try {
                                    aVar.close();
                                    break;
                                } catch (IOException e3) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                                }
                                return string;
                            case 3:
                                int[] iArr = new int[this.f38250b];
                                while (length < this.f38250b) {
                                    iArr[length] = aVar.readUnsignedShort();
                                    length++;
                                }
                                try {
                                    aVar.close();
                                    break;
                                } catch (IOException e4) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                                }
                                return iArr;
                            case 4:
                                long[] jArr = new long[this.f38250b];
                                while (length < this.f38250b) {
                                    jArr[length] = aVar.m16426a();
                                    length++;
                                }
                                try {
                                    aVar.close();
                                    break;
                                } catch (IOException e5) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e5);
                                }
                                return jArr;
                            case 5:
                                d[] dVarArr = new d[this.f38250b];
                                while (length < this.f38250b) {
                                    dVarArr[length] = new d(aVar.m16426a(), aVar.m16426a());
                                    length++;
                                }
                                try {
                                    aVar.close();
                                    break;
                                } catch (IOException e6) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                                }
                                return dVarArr;
                            case 8:
                                int[] iArr2 = new int[this.f38250b];
                                while (length < this.f38250b) {
                                    iArr2[length] = aVar.readShort();
                                    length++;
                                }
                                try {
                                    aVar.close();
                                    break;
                                } catch (IOException e7) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                                }
                                return iArr2;
                            case 9:
                                int[] iArr3 = new int[this.f38250b];
                                while (length < this.f38250b) {
                                    iArr3[length] = aVar.readInt();
                                    length++;
                                }
                                try {
                                    aVar.close();
                                    break;
                                } catch (IOException e8) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e8);
                                }
                                return iArr3;
                            case 10:
                                d[] dVarArr2 = new d[this.f38250b];
                                while (length < this.f38250b) {
                                    dVarArr2[length] = new d(aVar.readInt(), aVar.readInt());
                                    length++;
                                }
                                try {
                                    aVar.close();
                                    break;
                                } catch (IOException e9) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e9);
                                }
                                return dVarArr2;
                            case 11:
                                double[] dArr = new double[this.f38250b];
                                while (length < this.f38250b) {
                                    dArr[length] = aVar.readFloat();
                                    length++;
                                }
                                try {
                                    aVar.close();
                                    break;
                                } catch (IOException e10) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                                }
                                return dArr;
                            case 12:
                                double[] dArr2 = new double[this.f38250b];
                                while (length < this.f38250b) {
                                    dArr2[length] = aVar.readDouble();
                                    length++;
                                }
                                try {
                                    aVar.close();
                                    break;
                                } catch (IOException e11) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                                }
                                return dArr2;
                            default:
                                try {
                                    aVar.close();
                                    break;
                                } catch (IOException e12) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                                }
                                return null;
                        }
                    } catch (IOException e13) {
                        e = e13;
                        Log.w("ExifInterface", "IOException occurred during reading a value", e);
                        if (aVar != null) {
                            try {
                                aVar.close();
                            } catch (IOException e14) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                            }
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e15) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                        }
                    }
                    throw th;
                }
            } catch (IOException e16) {
                e = e16;
                aVar = null;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                throw th;
            }
        }

        public String toString() {
            StringBuilder sbM1556G = outline.m1556G("(");
            sbM1556G.append(ExifInterface.f38213i[this.f38249a]);
            sbM1556G.append(", data length:");
            return outline.m1603y(sbM1556G, this.f38251c.length, ")");
        }
    }

    /* JADX INFO: renamed from: z0.o.a.a$d */
    /* JADX INFO: compiled from: ExifInterface.java */
    public static class d {

        /* JADX INFO: renamed from: a */
        public final long f38256a;

        /* JADX INFO: renamed from: b */
        public final long f38257b;

        public d(long j2, long j3) {
            if (j3 == 0) {
                this.f38256a = 0L;
                this.f38257b = 1L;
            } else {
                this.f38256a = j2;
                this.f38257b = j3;
            }
        }

        public String toString() {
            return this.f38256a + "/" + this.f38257b;
        }
    }

    static {
        c[] cVarArr = {new c("NewSubfileType", 254, 4), new c("SubfileType", 255, 4), new c("ImageWidth", 256, 3, 4), new c("ImageLength", 257, 3, 4), new c("BitsPerSample", 258, 3), new c("Compression", 259, 3), new c("PhotometricInterpretation", 262, 3), new c("ImageDescription", 270, 2), new c("Make", 271, 2), new c("Model", 272, 2), new c("StripOffsets", 273, 3, 4), new c("Orientation", 274, 3), new c("SamplesPerPixel", 277, 3), new c("RowsPerStrip", 278, 3, 4), new c("StripByteCounts", 279, 3, 4), new c("XResolution", 282, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", 301, 3), new c("Software", 305, 2), new c("DateTime", 306, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c("SubIFDPointer", 330, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", 514, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("SensorTopBorder", 4, 4), new c("SensorLeftBorder", 5, 4), new c("SensorBottomBorder", 6, 4), new c("SensorRightBorder", 7, 4), new c("ISO", 23, 3), new c("JpgFromRaw", 46, 7)};
        f38216l = cVarArr;
        c[] cVarArr2 = {new c("ExposureTime", 33434, 5), new c("FNumber", 33437, 5), new c("ExposureProgram", 34850, 3), new c("SpectralSensitivity", 34852, 2), new c("PhotographicSensitivity", 34855, 3), new c("OECF", 34856, 7), new c("ExifVersion", 36864, 2), new c("DateTimeOriginal", 36867, 2), new c("DateTimeDigitized", 36868, 2), new c("ComponentsConfiguration", 37121, 7), new c("CompressedBitsPerPixel", 37122, 5), new c("ShutterSpeedValue", 37377, 10), new c("ApertureValue", 37378, 5), new c("BrightnessValue", 37379, 10), new c("ExposureBiasValue", 37380, 10), new c("MaxApertureValue", 37381, 5), new c("SubjectDistance", 37382, 5), new c("MeteringMode", 37383, 3), new c("LightSource", 37384, 3), new c("Flash", 37385, 3), new c("FocalLength", 37386, 5), new c("SubjectArea", 37396, 3), new c("MakerNote", 37500, 7), new c("UserComment", 37510, 7), new c("SubSecTime", 37520, 2), new c("SubSecTimeOriginal", 37521, 2), new c("SubSecTimeDigitized", 37522, 2), new c("FlashpixVersion", 40960, 7), new c("ColorSpace", 40961, 3), new c("PixelXDimension", 40962, 3, 4), new c("PixelYDimension", 40963, 3, 4), new c("RelatedSoundFile", 40964, 2), new c("InteroperabilityIFDPointer", 40965, 4), new c("FlashEnergy", 41483, 5), new c("SpatialFrequencyResponse", 41484, 7), new c("FocalPlaneXResolution", 41486, 5), new c("FocalPlaneYResolution", 41487, 5), new c("FocalPlaneResolutionUnit", 41488, 3), new c("SubjectLocation", 41492, 3), new c("ExposureIndex", 41493, 5), new c("SensingMethod", 41495, 3), new c("FileSource", 41728, 7), new c("SceneType", 41729, 7), new c("CFAPattern", 41730, 7), new c("CustomRendered", 41985, 3), new c("ExposureMode", 41986, 3), new c("WhiteBalance", 41987, 3), new c("DigitalZoomRatio", 41988, 5), new c("FocalLengthIn35mmFilm", 41989, 3), new c("SceneCaptureType", 41990, 3), new c("GainControl", 41991, 3), new c("Contrast", 41992, 3), new c("Saturation", 41993, 3), new c("Sharpness", 41994, 3), new c("DeviceSettingDescription", 41995, 7), new c("SubjectDistanceRange", 41996, 3), new c("ImageUniqueID", 42016, 2), new c("DNGVersion", 50706, 1), new c("DefaultCropSize", 50720, 3, 4)};
        f38217m = cVarArr2;
        c[] cVarArr3 = {new c("GPSVersionID", 0, 1), new c("GPSLatitudeRef", 1, 2), new c("GPSLatitude", 2, 5), new c("GPSLongitudeRef", 3, 2), new c("GPSLongitude", 4, 5), new c("GPSAltitudeRef", 5, 1), new c("GPSAltitude", 6, 5), new c("GPSTimeStamp", 7, 5), new c("GPSSatellites", 8, 2), new c("GPSStatus", 9, 2), new c("GPSMeasureMode", 10, 2), new c("GPSDOP", 11, 5), new c("GPSSpeedRef", 12, 2), new c("GPSSpeed", 13, 5), new c("GPSTrackRef", 14, 2), new c("GPSTrack", 15, 5), new c("GPSImgDirectionRef", 16, 2), new c("GPSImgDirection", 17, 5), new c("GPSMapDatum", 18, 2), new c("GPSDestLatitudeRef", 19, 2), new c("GPSDestLatitude", 20, 5), new c("GPSDestLongitudeRef", 21, 2), new c("GPSDestLongitude", 22, 5), new c("GPSDestBearingRef", 23, 2), new c("GPSDestBearing", 24, 5), new c("GPSDestDistanceRef", 25, 2), new c("GPSDestDistance", 26, 5), new c("GPSProcessingMethod", 27, 7), new c("GPSAreaInformation", 28, 7), new c("GPSDateStamp", 29, 2), new c("GPSDifferential", 30, 3)};
        f38218n = cVarArr3;
        c[] cVarArr4 = {new c("InteroperabilityIndex", 1, 2)};
        f38219o = cVarArr4;
        c[] cVarArr5 = {new c("NewSubfileType", 254, 4), new c("SubfileType", 255, 4), new c("ThumbnailImageWidth", 256, 3, 4), new c("ThumbnailImageLength", 257, 3, 4), new c("BitsPerSample", 258, 3), new c("Compression", 259, 3), new c("PhotometricInterpretation", 262, 3), new c("ImageDescription", 270, 2), new c("Make", 271, 2), new c("Model", 272, 2), new c("StripOffsets", 273, 3, 4), new c("Orientation", 274, 3), new c("SamplesPerPixel", 277, 3), new c("RowsPerStrip", 278, 3, 4), new c("StripByteCounts", 279, 3, 4), new c("XResolution", 282, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", 301, 3), new c("Software", 305, 2), new c("DateTime", 306, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c("SubIFDPointer", 330, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", 514, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("DNGVersion", 50706, 1), new c("DefaultCropSize", 50720, 3, 4)};
        f38220p = cVarArr5;
        f38221q = new c("StripOffsets", 273, 3);
        c[] cVarArr6 = {new c("ThumbnailImage", 256, 7), new c("CameraSettingsIFDPointer", 8224, 4), new c("ImageProcessingIFDPointer", 8256, 4)};
        f38222r = cVarArr6;
        c[] cVarArr7 = {new c("PreviewImageStart", 257, 4), new c("PreviewImageLength", 258, 4)};
        f38223s = cVarArr7;
        c[] cVarArr8 = {new c("AspectFrame", 4371, 3)};
        f38224t = cVarArr8;
        c[] cVarArr9 = {new c("ColorSpace", 55, 3)};
        f38225u = cVarArr9;
        c[][] cVarArr10 = {cVarArr, cVarArr2, cVarArr3, cVarArr4, cVarArr5, cVarArr, cVarArr6, cVarArr7, cVarArr8, cVarArr9};
        f38226v = cVarArr10;
        f38227w = new c[]{new c("SubIFDPointer", 330, 4), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("InteroperabilityIFDPointer", 40965, 4), new c("CameraSettingsIFDPointer", 8224, 1), new c("ImageProcessingIFDPointer", 8256, 1)};
        f38228x = new HashMap[cVarArr10.length];
        f38229y = new HashMap[cVarArr10.length];
        f38230z = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f38202A = new HashMap<>();
        Charset charsetForName = Charset.forName("US-ASCII");
        f38203B = charsetForName;
        f38204C = "Exif\u0000\u0000".getBytes(charsetForName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        f38212h = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            c[][] cVarArr11 = f38226v;
            if (i >= cVarArr11.length) {
                HashMap<Integer, Integer> map = f38202A;
                c[] cVarArr12 = f38227w;
                map.put(Integer.valueOf(cVarArr12[0].f38252a), 5);
                map.put(Integer.valueOf(cVarArr12[1].f38252a), 1);
                map.put(Integer.valueOf(cVarArr12[2].f38252a), 2);
                map.put(Integer.valueOf(cVarArr12[3].f38252a), 3);
                map.put(Integer.valueOf(cVarArr12[4].f38252a), 7);
                map.put(Integer.valueOf(cVarArr12[5].f38252a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
            f38228x[i] = new HashMap<>();
            f38229y[i] = new HashMap<>();
            for (c cVar : cVarArr11[i]) {
                f38228x[i].put(Integer.valueOf(cVar.f38252a), cVar);
                f38229y[i].put(cVar.f38253b, cVar);
            }
            i++;
        }
    }

    public ExifInterface(String str) throws Throwable {
        c[][] cVarArr = f38226v;
        this.f38234G = new HashMap[cVarArr.length];
        this.f38235H = new HashSet(cVarArr.length);
        this.f38236I = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new IllegalArgumentException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.f38232E = null;
        this.f38231D = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                m16419m(fileInputStream2);
                try {
                    fileInputStream2.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static long[] m16407b(Object obj) {
        if (!(obj instanceof int[])) {
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            return null;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    /* JADX INFO: renamed from: a */
    public final void m16408a() {
        String strM16409c = m16409c("DateTimeOriginal");
        if (strM16409c != null && m16409c("DateTime") == null) {
            this.f38234G[0].put("DateTime", b.m16428a(strM16409c));
        }
        if (m16409c("ImageWidth") == null) {
            this.f38234G[0].put("ImageWidth", b.m16429b(0L, this.f38236I));
        }
        if (m16409c("ImageLength") == null) {
            this.f38234G[0].put("ImageLength", b.m16429b(0L, this.f38236I));
        }
        if (m16409c("Orientation") == null) {
            this.f38234G[0].put("Orientation", b.m16429b(0L, this.f38236I));
        }
        if (m16409c("LightSource") == null) {
            this.f38234G[1].put("LightSource", b.m16429b(0L, this.f38236I));
        }
    }

    /* JADX INFO: renamed from: c */
    public String m16409c(String str) {
        b bVarM16410d = m16410d(str);
        if (bVarM16410d != null) {
            if (!f38230z.contains(str)) {
                return bVarM16410d.m16434g(this.f38236I);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = bVarM16410d.f38249a;
                if (i != 5 && i != 10) {
                    StringBuilder sbM1556G = outline.m1556G("GPS Timestamp format is not rational. format=");
                    sbM1556G.append(bVarM16410d.f38249a);
                    Log.w("ExifInterface", sbM1556G.toString());
                    return null;
                }
                d[] dVarArr = (d[]) bVarM16410d.m16435h(this.f38236I);
                if (dVarArr != null && dVarArr.length == 3) {
                    return String.format("%02d:%02d:%02d", Integer.valueOf((int) (dVarArr[0].f38256a / dVarArr[0].f38257b)), Integer.valueOf((int) (dVarArr[1].f38256a / dVarArr[1].f38257b)), Integer.valueOf((int) (dVarArr[2].f38256a / dVarArr[2].f38257b)));
                }
                StringBuilder sbM1556G2 = outline.m1556G("Invalid GPS Timestamp array. array=");
                sbM1556G2.append(Arrays.toString(dVarArr));
                Log.w("ExifInterface", sbM1556G2.toString());
                return null;
            }
            try {
                return Double.toString(bVarM16410d.m16432e(this.f38236I));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final b m16410d(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f38226v.length; i++) {
            b bVar = this.f38234G[i].get(str);
            if (bVar != null) {
                return bVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0055 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0086 A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1091)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /* JADX INFO: renamed from: e */
    public final void m16411e(p636z0.p750o.p751a.ExifInterface.a r9, int r10, int r11) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p636z0.p750o.p751a.ExifInterface.m16411e(z0.o.a.a$a, int, int):void");
    }

    /* JADX INFO: renamed from: f */
    public final int m16412f(BufferedInputStream bufferedInputStream) throws IOException {
        boolean z;
        boolean z2;
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i = 0;
        while (true) {
            byte[] bArr2 = f38209e;
            if (i >= bArr2.length) {
                z = true;
                break;
            }
            if (bArr[i] != bArr2[i]) {
                z = false;
                break;
            }
            i++;
        }
        if (z) {
            return 4;
        }
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        int i2 = 0;
        while (true) {
            if (i2 >= bytes.length) {
                z2 = true;
                break;
            }
            if (bArr[i2] != bytes[i2]) {
                z2 = false;
                break;
            }
            i2++;
        }
        if (z2) {
            return 9;
        }
        a aVar = new a(bArr);
        ByteOrder byteOrderM16421o = m16421o(aVar);
        this.f38236I = byteOrderM16421o;
        aVar.f38246i = byteOrderM16421o;
        short s = aVar.readShort();
        aVar.close();
        if (s == 20306 || s == 21330) {
            return 7;
        }
        a aVar2 = new a(bArr);
        ByteOrder byteOrderM16421o2 = m16421o(aVar2);
        this.f38236I = byteOrderM16421o2;
        aVar2.f38246i = byteOrderM16421o2;
        short s2 = aVar2.readShort();
        aVar2.close();
        return s2 == 85 ? 10 : 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m16413g(a aVar) throws Throwable {
        m16415i(aVar);
        b bVar = this.f38234G[1].get("MakerNote");
        if (bVar != null) {
            a aVar2 = new a(bVar.f38251c);
            aVar2.f38246i = this.f38236I;
            byte[] bArr = f38210f;
            byte[] bArr2 = new byte[bArr.length];
            aVar2.readFully(bArr2);
            aVar2.m16427c(0L);
            byte[] bArr3 = f38211g;
            byte[] bArr4 = new byte[bArr3.length];
            aVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                aVar2.m16427c(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                aVar2.m16427c(12L);
            }
            m16422p(aVar2, 6);
            b bVar2 = this.f38234G[7].get("PreviewImageStart");
            b bVar3 = this.f38234G[7].get("PreviewImageLength");
            if (bVar2 != null && bVar3 != null) {
                this.f38234G[5].put("JPEGInterchangeFormat", bVar2);
                this.f38234G[5].put("JPEGInterchangeFormatLength", bVar3);
            }
            b bVar4 = this.f38234G[8].get("AspectFrame");
            if (bVar4 != null) {
                int[] iArr = (int[]) bVar4.m16435h(this.f38236I);
                if (iArr == null || iArr.length != 4) {
                    StringBuilder sbM1556G = outline.m1556G("Invalid aspect frame values. frame=");
                    sbM1556G.append(Arrays.toString(iArr));
                    Log.w("ExifInterface", sbM1556G.toString());
                } else {
                    if (iArr[2] <= iArr[0] || iArr[3] <= iArr[1]) {
                        return;
                    }
                    int i = (iArr[2] - iArr[0]) + 1;
                    int i2 = (iArr[3] - iArr[1]) + 1;
                    if (i < i2) {
                        int i3 = i + i2;
                        i2 = i3 - i2;
                        i = i3 - i2;
                    }
                    b bVarM16431d = b.m16431d(i, this.f38236I);
                    b bVarM16431d2 = b.m16431d(i2, this.f38236I);
                    this.f38234G[0].put("ImageWidth", bVarM16431d);
                    this.f38234G[0].put("ImageLength", bVarM16431d2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m16414h(a aVar) throws IOException {
        aVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        aVar.read(bArr);
        aVar.skipBytes(4);
        aVar.read(bArr2);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        m16411e(aVar, i, 5);
        aVar.m16427c(i2);
        aVar.f38246i = ByteOrder.BIG_ENDIAN;
        int i3 = aVar.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            int unsignedShort = aVar.readUnsignedShort();
            int unsignedShort2 = aVar.readUnsignedShort();
            if (unsignedShort == f38221q.f38252a) {
                short s = aVar.readShort();
                short s2 = aVar.readShort();
                b bVarM16431d = b.m16431d(s, this.f38236I);
                b bVarM16431d2 = b.m16431d(s2, this.f38236I);
                this.f38234G[0].put("ImageLength", bVarM16431d);
                this.f38234G[0].put("ImageWidth", bVarM16431d2);
                return;
            }
            aVar.skipBytes(unsignedShort2);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m16415i(a aVar) throws Throwable {
        b bVar;
        m16420n(aVar, aVar.available());
        m16422p(aVar, 0);
        m16425s(aVar, 0);
        m16425s(aVar, 5);
        m16425s(aVar, 4);
        m16424r(0, 5);
        m16424r(0, 4);
        m16424r(5, 4);
        b bVar2 = this.f38234G[1].get("PixelXDimension");
        b bVar3 = this.f38234G[1].get("PixelYDimension");
        if (bVar2 != null && bVar3 != null) {
            this.f38234G[0].put("ImageWidth", bVar2);
            this.f38234G[0].put("ImageLength", bVar3);
        }
        if (this.f38234G[4].isEmpty() && m16418l(this.f38234G[5])) {
            HashMap<String, b>[] mapArr = this.f38234G;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        if (!m16418l(this.f38234G[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        if (this.f38233F != 8 || (bVar = this.f38234G[1].get("MakerNote")) == null) {
            return;
        }
        a aVar2 = new a(bVar.f38251c);
        aVar2.f38246i = this.f38236I;
        aVar2.m16427c(6L);
        m16422p(aVar2, 9);
        b bVar4 = this.f38234G[9].get("ColorSpace");
        if (bVar4 != null) {
            this.f38234G[1].put("ColorSpace", bVar4);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m16416j(a aVar) throws Throwable {
        m16415i(aVar);
        if (this.f38234G[0].get("JpgFromRaw") != null) {
            m16411e(aVar, this.f38242O, 5);
        }
        b bVar = this.f38234G[0].get("ISO");
        b bVar2 = this.f38234G[1].get("PhotographicSensitivity");
        if (bVar == null || bVar2 != null) {
            return;
        }
        this.f38234G[1].put("PhotographicSensitivity", bVar);
    }

    /* JADX INFO: renamed from: k */
    public final void m16417k(a aVar, HashMap map) throws Throwable {
        int i;
        b bVar = (b) map.get("JPEGInterchangeFormat");
        b bVar2 = (b) map.get("JPEGInterchangeFormatLength");
        if (bVar == null || bVar2 == null) {
            return;
        }
        int iM16433f = bVar.m16433f(this.f38236I);
        int iMin = Math.min(bVar2.m16433f(this.f38236I), aVar.available() - iM16433f);
        int i2 = this.f38233F;
        if (i2 != 4 && i2 != 9 && i2 != 10) {
            if (i2 == 7) {
                i = this.f38239L;
            }
            if (iM16433f > 0 || iMin <= 0 || this.f38231D != null || this.f38232E != null) {
                return;
            }
            aVar.m16427c(iM16433f);
            aVar.readFully(new byte[iMin]);
            return;
        }
        i = this.f38238K;
        iM16433f += i;
        if (iM16433f > 0) {
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m16418l(HashMap map) throws IOException {
        b bVar = (b) map.get("ImageLength");
        b bVar2 = (b) map.get("ImageWidth");
        if (bVar == null || bVar2 == null) {
            return false;
        }
        return bVar.m16433f(this.f38236I) <= 512 && bVar2.m16433f(this.f38236I) <= 512;
    }

    /* JADX INFO: renamed from: m */
    public final void m16419m(InputStream inputStream) throws IOException {
        for (int i = 0; i < f38226v.length; i++) {
            try {
                this.f38234G[i] = new HashMap<>();
            } catch (IOException unused) {
            } catch (Throwable th) {
                m16408a();
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        this.f38233F = m16412f(bufferedInputStream);
        a aVar = new a(bufferedInputStream);
        switch (this.f38233F) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
                m16415i(aVar);
                break;
            case 4:
                m16411e(aVar, 0, 0);
                break;
            case 7:
                m16413g(aVar);
                break;
            case 9:
                m16414h(aVar);
                break;
            case 10:
                m16416j(aVar);
                break;
        }
        m16423q(aVar);
        m16408a();
    }

    /* JADX INFO: renamed from: n */
    public final void m16420n(a aVar, int i) throws IOException {
        ByteOrder byteOrderM16421o = m16421o(aVar);
        this.f38236I = byteOrderM16421o;
        aVar.f38246i = byteOrderM16421o;
        int unsignedShort = aVar.readUnsignedShort();
        int i2 = this.f38233F;
        if (i2 != 7 && i2 != 10 && unsignedShort != 42) {
            StringBuilder sbM1556G = outline.m1556G("Invalid start code: ");
            sbM1556G.append(Integer.toHexString(unsignedShort));
            throw new IOException(sbM1556G.toString());
        }
        int i3 = aVar.readInt();
        if (i3 < 8 || i3 >= i) {
            throw new IOException(outline.m1590l("Invalid first Ifd offset: ", i3));
        }
        int i4 = i3 - 8;
        if (i4 > 0 && aVar.skipBytes(i4) != i4) {
            throw new IOException(outline.m1590l("Couldn't jump to first Ifd: ", i4));
        }
    }

    /* JADX INFO: renamed from: o */
    public final ByteOrder m16421o(a aVar) throws IOException {
        short s = aVar.readShort();
        if (s == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        StringBuilder sbM1556G = outline.m1556G("Invalid byte order: ");
        sbM1556G.append(Integer.toHexString(s));
        throw new IOException(sbM1556G.toString());
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:103:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:107:0x01de  */
    /* JADX WARN: Code duplicated, block: B:113:0x0218  */
    /* JADX WARN: Code duplicated, block: B:115:0x0230  */
    /* JADX WARN: Code duplicated, block: B:117:0x0252  */
    /* JADX WARN: Code duplicated, block: B:120:0x025f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0269  */
    /* JADX WARN: Code duplicated, block: B:131:0x0295  */
    /* JADX WARN: Code duplicated, block: B:155:0x0298 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00df  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:70:0x0103  */
    /* JADX WARN: Code duplicated, block: B:71:0x0106  */
    /* JADX WARN: Code duplicated, block: B:73:0x0109  */
    /* JADX WARN: Code duplicated, block: B:77:0x0158  */
    /* JADX WARN: Code duplicated, block: B:79:0x0162  */
    /* JADX WARN: Code duplicated, block: B:84:0x0178  */
    /* JADX WARN: Code duplicated, block: B:85:0x017e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0199  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:95:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:97:0x01bf  */
    /* JADX WARN: Instruction removed from duplicated block: B:113:0x0218, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:85:0x017e, please report this as an issue */
    /* JADX INFO: renamed from: p */
    public final void m16422p(a aVar, int i) throws IOException {
        long j2;
        boolean z;
        int i2;
        int i3;
        int i4;
        short s;
        Integer num;
        long jM16426a;
        int i5;
        int unsignedShort;
        int i6;
        int i7;
        long j3;
        long j4;
        this.f38235H.add(Integer.valueOf(aVar.f38248k));
        if (aVar.f38248k + 2 > aVar.f38247j) {
            return;
        }
        short s2 = aVar.readShort();
        if ((s2 * 12) + aVar.f38248k > aVar.f38247j || s2 <= 0) {
            return;
        }
        short s3 = 0;
        while (s3 < s2) {
            int unsignedShort2 = aVar.readUnsignedShort();
            int unsignedShort3 = aVar.readUnsignedShort();
            int i8 = aVar.readInt();
            long j5 = ((long) aVar.f38248k) + 4;
            c cVar = f38228x[i].get(Integer.valueOf(unsignedShort2));
            if (cVar == null) {
                outline.m1565P("Skip the tag entry since tag number is not defined: ", unsignedShort2, "ExifInterface");
            } else {
                if (unsignedShort3 > 0) {
                    int[] iArr = f38214j;
                    if (unsignedShort3 < iArr.length) {
                        int i9 = cVar.f38254c;
                        if (i9 == 7 || unsignedShort3 == 7 || i9 == unsignedShort3 || (i2 = cVar.f38255d) == unsignedShort3 || ((i9 == 4 || i2 == 4) && unsignedShort3 == 3) || (((i9 == 9 || i2 == 9) && unsignedShort3 == 8) || ((i9 == 12 || i2 == 12) && unsignedShort3 == 11))) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = i9;
                            }
                            int i10 = iArr[unsignedShort3];
                            s2 = s2;
                            s3 = s3;
                            j2 = ((long) i10) * ((long) i8);
                            if (j2 < 0 || j2 > 2147483647L) {
                                outline.m1565P("Skip the tag entry since the number of components is invalid: ", i8, "ExifInterface");
                                z = false;
                            } else {
                                z = true;
                            }
                        } else {
                            StringBuilder sbM1556G = outline.m1556G("Skip the tag entry since data format (");
                            sbM1556G.append(f38213i[unsignedShort3]);
                            sbM1556G.append(") is unexpected for tag: ");
                            outline.m1571V(sbM1556G, cVar.f38253b, "ExifInterface");
                        }
                    }
                    if (z) {
                        if (j2 > 4) {
                            i6 = aVar.readInt();
                            i7 = this.f38233F;
                            s = s2;
                            if (i7 == 7) {
                                if ("MakerNote".equals(cVar.f38253b)) {
                                    this.f38239L = i6;
                                } else if (i != 6 && "ThumbnailImage".equals(cVar.f38253b)) {
                                    this.f38240M = i6;
                                    this.f38241N = i8;
                                    b bVarM16431d = b.m16431d(6, this.f38236I);
                                    i3 = unsignedShort3;
                                    i4 = i8;
                                    b bVarM16429b = b.m16429b(this.f38240M, this.f38236I);
                                    j3 = j5;
                                    b bVarM16429b2 = b.m16429b(this.f38241N, this.f38236I);
                                    this.f38234G[4].put("Compression", bVarM16431d);
                                    this.f38234G[4].put("JPEGInterchangeFormat", bVarM16429b);
                                    this.f38234G[4].put("JPEGInterchangeFormatLength", bVarM16429b2);
                                }
                                i3 = unsignedShort3;
                                i4 = i8;
                                j3 = j5;
                            } else {
                                i3 = unsignedShort3;
                                i4 = i8;
                                j3 = j5;
                                if (i7 == 10 && "JpgFromRaw".equals(cVar.f38253b)) {
                                    this.f38242O = i6;
                                }
                            }
                            j4 = i6;
                            if (j4 + j2 <= aVar.f38247j) {
                                aVar.m16427c(j4);
                                j5 = j3;
                            } else {
                                Log.w("ExifInterface", "Skip the tag entry since data offset is invalid: " + i6);
                                aVar.m16427c(j3);
                            }
                        } else {
                            i3 = unsignedShort3;
                            i4 = i8;
                            s = s2;
                        }
                        num = f38202A.get(Integer.valueOf(unsignedShort2));
                        if (num != null) {
                            jM16426a = -1;
                            i5 = i3;
                            if (i5 != 3) {
                                if (i5 == 4) {
                                    jM16426a = aVar.m16426a();
                                } else if (i5 == 8) {
                                    unsignedShort = aVar.readShort();
                                } else if (i5 != 9 || i5 == 13) {
                                    unsignedShort = aVar.readInt();
                                }
                                if (jM16426a > 0 || jM16426a >= aVar.f38247j) {
                                    Log.w("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + jM16426a);
                                } else if (this.f38235H.contains(Integer.valueOf((int) jM16426a))) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Skip jump into the IFD since it has already been read: IfdType ");
                                    sb.append(num);
                                    sb.append(" (at ");
                                    sb.append(jM16426a);
                                    outline.m1571V(sb, ")", "ExifInterface");
                                } else {
                                    aVar.m16427c(jM16426a);
                                    m16422p(aVar, num.intValue());
                                }
                                aVar.m16427c(j5);
                            } else {
                                unsignedShort = aVar.readUnsignedShort();
                            }
                            jM16426a = unsignedShort;
                            if (jM16426a > 0) {
                                Log.w("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + jM16426a);
                            } else {
                                Log.w("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + jM16426a);
                            }
                            aVar.m16427c(j5);
                        } else {
                            byte[] bArr = new byte[(int) j2];
                            aVar.readFully(bArr);
                            b bVar = new b(i3, i4, bArr);
                            this.f38234G[i].put(cVar.f38253b, bVar);
                            if ("DNGVersion".equals(cVar.f38253b)) {
                                this.f38233F = 3;
                            }
                            if (((!"Make".equals(cVar.f38253b) || "Model".equals(cVar.f38253b)) && bVar.m16434g(this.f38236I).contains("PENTAX")) || ("Compression".equals(cVar.f38253b) && bVar.m16433f(this.f38236I) == 65535)) {
                                this.f38233F = 8;
                            }
                            if (aVar.f38248k != j5) {
                                aVar.m16427c(j5);
                            }
                        }
                    } else {
                        aVar.m16427c(j5);
                        s = s2;
                    }
                    s3 = (short) (s3 + 1);
                    s2 = s;
                }
                outline.m1565P("Skip the tag entry since data format is invalid: ", unsignedShort3, "ExifInterface");
                j2 = 0;
                z = false;
                if (z) {
                    aVar.m16427c(j5);
                    s = s2;
                } else {
                    if (j2 > 4) {
                        i6 = aVar.readInt();
                        i7 = this.f38233F;
                        s = s2;
                        if (i7 == 7) {
                            if ("MakerNote".equals(cVar.f38253b)) {
                                this.f38239L = i6;
                            } else if (i != 6) {
                            }
                            i3 = unsignedShort3;
                            i4 = i8;
                            j3 = j5;
                        } else {
                            i3 = unsignedShort3;
                            i4 = i8;
                            j3 = j5;
                            if (i7 == 10) {
                                this.f38242O = i6;
                            }
                        }
                        j4 = i6;
                        if (j4 + j2 <= aVar.f38247j) {
                            aVar.m16427c(j4);
                            j5 = j3;
                        } else {
                            Log.w("ExifInterface", "Skip the tag entry since data offset is invalid: " + i6);
                            aVar.m16427c(j3);
                        }
                    } else {
                        i3 = unsignedShort3;
                        i4 = i8;
                        s = s2;
                    }
                    num = f38202A.get(Integer.valueOf(unsignedShort2));
                    if (num != null) {
                        jM16426a = -1;
                        i5 = i3;
                        if (i5 != 3) {
                            if (i5 == 4) {
                                jM16426a = aVar.m16426a();
                            } else if (i5 == 8) {
                                if (i5 != 9) {
                                }
                                unsignedShort = aVar.readInt();
                            } else {
                                unsignedShort = aVar.readShort();
                            }
                            if (jM16426a > 0) {
                                Log.w("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + jM16426a);
                            } else {
                                Log.w("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + jM16426a);
                            }
                            aVar.m16427c(j5);
                        } else {
                            unsignedShort = aVar.readUnsignedShort();
                        }
                        jM16426a = unsignedShort;
                        if (jM16426a > 0) {
                            Log.w("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + jM16426a);
                        } else {
                            Log.w("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + jM16426a);
                        }
                        aVar.m16427c(j5);
                    } else {
                        byte[] bArr2 = new byte[(int) j2];
                        aVar.readFully(bArr2);
                        b bVar2 = new b(i3, i4, bArr2);
                        this.f38234G[i].put(cVar.f38253b, bVar2);
                        if ("DNGVersion".equals(cVar.f38253b)) {
                            this.f38233F = 3;
                        }
                        if (!"Make".equals(cVar.f38253b)) {
                        }
                        this.f38233F = 8;
                        if (aVar.f38248k != j5) {
                            aVar.m16427c(j5);
                        }
                    }
                }
                s3 = (short) (s3 + 1);
                s2 = s;
            }
            j2 = 0;
            z = false;
            if (z) {
                aVar.m16427c(j5);
                s = s2;
            } else {
                if (j2 > 4) {
                    i6 = aVar.readInt();
                    i7 = this.f38233F;
                    s = s2;
                    if (i7 == 7) {
                        if ("MakerNote".equals(cVar.f38253b)) {
                            this.f38239L = i6;
                        } else if (i != 6) {
                        }
                        i3 = unsignedShort3;
                        i4 = i8;
                        j3 = j5;
                    } else {
                        i3 = unsignedShort3;
                        i4 = i8;
                        j3 = j5;
                        if (i7 == 10) {
                            this.f38242O = i6;
                        }
                    }
                    j4 = i6;
                    if (j4 + j2 <= aVar.f38247j) {
                        aVar.m16427c(j4);
                        j5 = j3;
                    } else {
                        Log.w("ExifInterface", "Skip the tag entry since data offset is invalid: " + i6);
                        aVar.m16427c(j3);
                    }
                } else {
                    i3 = unsignedShort3;
                    i4 = i8;
                    s = s2;
                }
                num = f38202A.get(Integer.valueOf(unsignedShort2));
                if (num != null) {
                    jM16426a = -1;
                    i5 = i3;
                    if (i5 != 3) {
                        if (i5 == 4) {
                            jM16426a = aVar.m16426a();
                        } else if (i5 == 8) {
                            if (i5 != 9) {
                            }
                            unsignedShort = aVar.readInt();
                        } else {
                            unsignedShort = aVar.readShort();
                        }
                        if (jM16426a > 0) {
                            Log.w("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + jM16426a);
                        } else {
                            Log.w("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + jM16426a);
                        }
                        aVar.m16427c(j5);
                    } else {
                        unsignedShort = aVar.readUnsignedShort();
                    }
                    jM16426a = unsignedShort;
                    if (jM16426a > 0) {
                        Log.w("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + jM16426a);
                    } else {
                        Log.w("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + jM16426a);
                    }
                    aVar.m16427c(j5);
                } else {
                    byte[] bArr3 = new byte[(int) j2];
                    aVar.readFully(bArr3);
                    b bVar3 = new b(i3, i4, bArr3);
                    this.f38234G[i].put(cVar.f38253b, bVar3);
                    if ("DNGVersion".equals(cVar.f38253b)) {
                        this.f38233F = 3;
                    }
                    if (!"Make".equals(cVar.f38253b)) {
                    }
                    this.f38233F = 8;
                    if (aVar.f38248k != j5) {
                        aVar.m16427c(j5);
                    }
                }
            }
            s3 = (short) (s3 + 1);
            s2 = s;
        }
        if (aVar.f38248k + 4 <= aVar.f38247j) {
            int i11 = aVar.readInt();
            long j6 = i11;
            if (j6 <= 0 || i11 >= aVar.f38247j) {
                outline.m1565P("Stop reading file since a wrong offset may cause an infinite loop: ", i11, "ExifInterface");
                return;
            }
            if (this.f38235H.contains(Integer.valueOf(i11))) {
                outline.m1565P("Stop reading file since re-reading an IFD may cause an infinite loop: ", i11, "ExifInterface");
                return;
            }
            aVar.m16427c(j6);
            if (this.f38234G[4].isEmpty()) {
                m16422p(aVar, 4);
            } else if (this.f38234G[5].isEmpty()) {
                m16422p(aVar, 5);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    /* JADX INFO: renamed from: q */
    public final void m16423q(a aVar) throws Throwable {
        b bVar;
        int iM16433f;
        HashMap<String, b> map = this.f38234G[4];
        b bVar2 = map.get("Compression");
        if (bVar2 == null) {
            this.f38237J = 6;
            m16417k(aVar, map);
            return;
        }
        int iM16433f2 = bVar2.m16433f(this.f38236I);
        this.f38237J = iM16433f2;
        boolean z = true;
        if (iM16433f2 != 1) {
            if (iM16433f2 == 6) {
                m16417k(aVar, map);
                return;
            } else if (iM16433f2 != 7) {
                return;
            }
        }
        b bVar3 = map.get("BitsPerSample");
        if (bVar3 != null) {
            int[] iArr = (int[]) bVar3.m16435h(this.f38236I);
            int[] iArr2 = f38207c;
            if (!Arrays.equals(iArr2, iArr) && (this.f38233F != 3 || (bVar = map.get("PhotometricInterpretation")) == null || (((iM16433f = bVar.m16433f(this.f38236I)) != 1 || !Arrays.equals(iArr, f38208d)) && (iM16433f != 6 || !Arrays.equals(iArr, iArr2))))) {
                z = false;
            }
        } else {
            z = false;
        }
        if (z) {
            b bVar4 = map.get("StripOffsets");
            b bVar5 = map.get("StripByteCounts");
            if (bVar4 == null || bVar5 == null) {
                return;
            }
            long[] jArrM16407b = m16407b(bVar4.m16435h(this.f38236I));
            long[] jArrM16407b2 = m16407b(bVar5.m16435h(this.f38236I));
            if (jArrM16407b == null) {
                Log.w("ExifInterface", "stripOffsets should not be null.");
                return;
            }
            if (jArrM16407b2 == null) {
                Log.w("ExifInterface", "stripByteCounts should not be null.");
                return;
            }
            long j2 = 0;
            for (long j3 : jArrM16407b2) {
                j2 += j3;
            }
            byte[] bArr = new byte[(int) j2];
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < jArrM16407b.length; i3++) {
                int i4 = (int) jArrM16407b[i3];
                int i5 = (int) jArrM16407b2[i3];
                int i6 = i4 - i;
                if (i6 < 0) {
                    Log.d("ExifInterface", "Invalid strip offset value");
                }
                aVar.m16427c(i6);
                int i7 = i + i6;
                byte[] bArr2 = new byte[i5];
                aVar.read(bArr2);
                i = i7 + i5;
                System.arraycopy(bArr2, 0, bArr, i2, i5);
                i2 += i5;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m16424r(int i, int i2) throws Throwable {
        if (this.f38234G[i].isEmpty() || this.f38234G[i2].isEmpty()) {
            return;
        }
        b bVar = this.f38234G[i].get("ImageLength");
        b bVar2 = this.f38234G[i].get("ImageWidth");
        b bVar3 = this.f38234G[i2].get("ImageLength");
        b bVar4 = this.f38234G[i2].get("ImageWidth");
        if (bVar == null || bVar2 == null || bVar3 == null || bVar4 == null) {
            return;
        }
        int iM16433f = bVar.m16433f(this.f38236I);
        int iM16433f2 = bVar2.m16433f(this.f38236I);
        int iM16433f3 = bVar3.m16433f(this.f38236I);
        int iM16433f4 = bVar4.m16433f(this.f38236I);
        if (iM16433f >= iM16433f3 || iM16433f2 >= iM16433f4) {
            return;
        }
        HashMap<String, b>[] mapArr = this.f38234G;
        HashMap<String, b> map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    /* JADX INFO: renamed from: s */
    public final void m16425s(a aVar, int i) throws Throwable {
        b bVar;
        b bVarM16431d;
        b bVarM16431d2;
        b bVar2 = this.f38234G[i].get("DefaultCropSize");
        b bVar3 = this.f38234G[i].get("SensorTopBorder");
        b bVar4 = this.f38234G[i].get("SensorLeftBorder");
        b bVar5 = this.f38234G[i].get("SensorBottomBorder");
        b bVar6 = this.f38234G[i].get("SensorRightBorder");
        if (bVar2 != null) {
            if (bVar2.f38249a == 5) {
                d[] dVarArr = (d[]) bVar2.m16435h(this.f38236I);
                if (dVarArr == null || dVarArr.length != 2) {
                    StringBuilder sbM1556G = outline.m1556G("Invalid crop size values. cropSize=");
                    sbM1556G.append(Arrays.toString(dVarArr));
                    Log.w("ExifInterface", sbM1556G.toString());
                    return;
                }
                bVarM16431d = b.m16430c(dVarArr[0], this.f38236I);
                bVarM16431d2 = b.m16430c(dVarArr[1], this.f38236I);
            } else {
                int[] iArr = (int[]) bVar2.m16435h(this.f38236I);
                if (iArr == null || iArr.length != 2) {
                    StringBuilder sbM1556G2 = outline.m1556G("Invalid crop size values. cropSize=");
                    sbM1556G2.append(Arrays.toString(iArr));
                    Log.w("ExifInterface", sbM1556G2.toString());
                    return;
                }
                bVarM16431d = b.m16431d(iArr[0], this.f38236I);
                bVarM16431d2 = b.m16431d(iArr[1], this.f38236I);
            }
            this.f38234G[i].put("ImageWidth", bVarM16431d);
            this.f38234G[i].put("ImageLength", bVarM16431d2);
            return;
        }
        if (bVar3 == null || bVar4 == null || bVar5 == null || bVar6 == null) {
            b bVar7 = this.f38234G[i].get("ImageLength");
            b bVar8 = this.f38234G[i].get("ImageWidth");
            if ((bVar7 == null || bVar8 == null) && (bVar = this.f38234G[i].get("JPEGInterchangeFormat")) != null) {
                m16411e(aVar, bVar.m16433f(this.f38236I), i);
                return;
            }
            return;
        }
        int iM16433f = bVar3.m16433f(this.f38236I);
        int iM16433f2 = bVar5.m16433f(this.f38236I);
        int iM16433f3 = bVar6.m16433f(this.f38236I);
        int iM16433f4 = bVar4.m16433f(this.f38236I);
        if (iM16433f2 <= iM16433f || iM16433f3 <= iM16433f4) {
            return;
        }
        b bVarM16431d3 = b.m16431d(iM16433f2 - iM16433f, this.f38236I);
        b bVarM16431d4 = b.m16431d(iM16433f3 - iM16433f4, this.f38236I);
        this.f38234G[i].put("ImageLength", bVarM16431d3);
        this.f38234G[i].put("ImageWidth", bVarM16431d4);
    }

    /* JADX INFO: renamed from: z0.o.a.a$a */
    /* JADX INFO: compiled from: ExifInterface.java */
    public static class a extends InputStream implements DataInput {

        /* JADX INFO: renamed from: f */
        public static final ByteOrder f38243f = ByteOrder.LITTLE_ENDIAN;

        /* JADX INFO: renamed from: g */
        public static final ByteOrder f38244g = ByteOrder.BIG_ENDIAN;

        /* JADX INFO: renamed from: h */
        public DataInputStream f38245h;

        /* JADX INFO: renamed from: i */
        public ByteOrder f38246i;

        /* JADX INFO: renamed from: j */
        public final int f38247j;

        /* JADX INFO: renamed from: k */
        public int f38248k;

        public a(InputStream inputStream) throws IOException {
            this.f38246i = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f38245h = dataInputStream;
            int iAvailable = dataInputStream.available();
            this.f38247j = iAvailable;
            this.f38248k = 0;
            this.f38245h.mark(iAvailable);
        }

        /* JADX INFO: renamed from: a */
        public long m16426a() throws IOException {
            return ((long) readInt()) & 4294967295L;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f38245h.available();
        }

        /* JADX INFO: renamed from: c */
        public void m16427c(long j2) throws IOException {
            int i = this.f38248k;
            if (i > j2) {
                this.f38248k = 0;
                this.f38245h.reset();
                this.f38245h.mark(this.f38247j);
            } else {
                j2 -= (long) i;
            }
            int i2 = (int) j2;
            if (skipBytes(i2) != i2) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.f38248k++;
            return this.f38245h.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.f38248k++;
            return this.f38245h.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            int i = this.f38248k + 1;
            this.f38248k = i;
            if (i > this.f38247j) {
                throw new EOFException();
            }
            int i2 = this.f38245h.read();
            if (i2 >= 0) {
                return (byte) i2;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.f38248k += 2;
            return this.f38245h.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f38248k + i2;
            this.f38248k = i3;
            if (i3 > this.f38247j) {
                throw new EOFException();
            }
            if (this.f38245h.read(bArr, i, i2) != i2) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            int i = this.f38248k + 4;
            this.f38248k = i;
            if (i > this.f38247j) {
                throw new EOFException();
            }
            int i2 = this.f38245h.read();
            int i3 = this.f38245h.read();
            int i4 = this.f38245h.read();
            int i5 = this.f38245h.read();
            if ((i2 | i3 | i4 | i5) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f38246i;
            if (byteOrder == f38243f) {
                return (i5 << 24) + (i4 << 16) + (i3 << 8) + i2;
            }
            if (byteOrder == f38244g) {
                return (i2 << 24) + (i3 << 16) + (i4 << 8) + i5;
            }
            StringBuilder sbM1556G = outline.m1556G("Invalid byte order: ");
            sbM1556G.append(this.f38246i);
            throw new IOException(sbM1556G.toString());
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            int i = this.f38248k + 8;
            this.f38248k = i;
            if (i > this.f38247j) {
                throw new EOFException();
            }
            int i2 = this.f38245h.read();
            int i3 = this.f38245h.read();
            int i4 = this.f38245h.read();
            int i5 = this.f38245h.read();
            int i6 = this.f38245h.read();
            int i7 = this.f38245h.read();
            int i8 = this.f38245h.read();
            int i9 = this.f38245h.read();
            if ((i2 | i3 | i4 | i5 | i6 | i7 | i8 | i9) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f38246i;
            if (byteOrder == f38243f) {
                return (((long) i9) << 56) + (((long) i8) << 48) + (((long) i7) << 40) + (((long) i6) << 32) + (((long) i5) << 24) + (((long) i4) << 16) + (((long) i3) << 8) + ((long) i2);
            }
            if (byteOrder == f38244g) {
                return (((long) i2) << 56) + (((long) i3) << 48) + (((long) i4) << 40) + (((long) i5) << 32) + (((long) i6) << 24) + (((long) i7) << 16) + (((long) i8) << 8) + ((long) i9);
            }
            StringBuilder sbM1556G = outline.m1556G("Invalid byte order: ");
            sbM1556G.append(this.f38246i);
            throw new IOException(sbM1556G.toString());
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            int i = this.f38248k + 2;
            this.f38248k = i;
            if (i > this.f38247j) {
                throw new EOFException();
            }
            int i2 = this.f38245h.read();
            int i3 = this.f38245h.read();
            if ((i2 | i3) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f38246i;
            if (byteOrder == f38243f) {
                return (short) ((i3 << 8) + i2);
            }
            if (byteOrder == f38244g) {
                return (short) ((i2 << 8) + i3);
            }
            StringBuilder sbM1556G = outline.m1556G("Invalid byte order: ");
            sbM1556G.append(this.f38246i);
            throw new IOException(sbM1556G.toString());
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.f38248k += 2;
            return this.f38245h.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.f38248k++;
            return this.f38245h.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            int i = this.f38248k + 2;
            this.f38248k = i;
            if (i > this.f38247j) {
                throw new EOFException();
            }
            int i2 = this.f38245h.read();
            int i3 = this.f38245h.read();
            if ((i2 | i3) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f38246i;
            if (byteOrder == f38243f) {
                return (i3 << 8) + i2;
            }
            if (byteOrder == f38244g) {
                return (i2 << 8) + i3;
            }
            StringBuilder sbM1556G = outline.m1556G("Invalid byte order: ");
            sbM1556G.append(this.f38246i);
            throw new IOException(sbM1556G.toString());
        }

        @Override // java.io.DataInput
        public int skipBytes(int i) throws IOException {
            int iMin = Math.min(i, this.f38247j - this.f38248k);
            int iSkipBytes = 0;
            while (iSkipBytes < iMin) {
                iSkipBytes += this.f38245h.skipBytes(iMin - iSkipBytes);
            }
            this.f38248k += iSkipBytes;
            return iSkipBytes;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f38245h.read(bArr, i, i2);
            this.f38248k += i3;
            return i3;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            int length = this.f38248k + bArr.length;
            this.f38248k = length;
            if (length <= this.f38247j) {
                if (this.f38245h.read(bArr, 0, bArr.length) != bArr.length) {
                    throw new IOException("Couldn't read up to the length of buffer");
                }
                return;
            }
            throw new EOFException();
        }

        public a(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr));
        }
    }

    /* JADX INFO: renamed from: z0.o.a.a$c */
    /* JADX INFO: compiled from: ExifInterface.java */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final int f38252a;

        /* JADX INFO: renamed from: b */
        public final String f38253b;

        /* JADX INFO: renamed from: c */
        public final int f38254c;

        /* JADX INFO: renamed from: d */
        public final int f38255d;

        public c(String str, int i, int i2) {
            this.f38253b = str;
            this.f38252a = i;
            this.f38254c = i2;
            this.f38255d = -1;
        }

        public c(String str, int i, int i2, int i3) {
            this.f38253b = str;
            this.f38252a = i;
            this.f38254c = i2;
            this.f38255d = i3;
        }
    }

    public ExifInterface(InputStream inputStream) throws IOException {
        c[][] cVarArr = f38226v;
        this.f38234G = new HashMap[cVarArr.length];
        this.f38235H = new HashSet(cVarArr.length);
        this.f38236I = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f38231D = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f38232E = (AssetManager.AssetInputStream) inputStream;
            } else {
                this.f38232E = null;
            }
            m16419m(inputStream);
            return;
        }
        throw new IllegalArgumentException("inputStream cannot be null");
    }
}
