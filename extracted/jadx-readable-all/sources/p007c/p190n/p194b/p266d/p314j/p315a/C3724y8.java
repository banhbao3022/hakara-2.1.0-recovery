package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import java.util.Collections;
import java.util.Map;
import mtp.media.karaoke.R;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p267a.p282z.C2313d;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p636z0.p691g.ArrayMap;

/* JADX INFO: renamed from: c.n.b.d.j.a.y8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3724y8 implements InterfaceC3464r8<InterfaceC3410ps> {

    /* JADX INFO: renamed from: a */
    public static final Map<String, Integer> f21805a;

    /* JADX INFO: renamed from: b */
    public final C2313d f21806b;

    /* JADX INFO: renamed from: c */
    public final C3065gg f21807c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3324ng f21808d;

    static {
        String[] strArr = {"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"};
        Integer[] numArr = {1, 2, 3, 4, 5, 6, 7};
        ArrayMap arrayMap = new ArrayMap(7);
        for (int i = 0; i < 7; i++) {
            arrayMap.put(strArr[i], numArr[i]);
        }
        f21805a = Collections.unmodifiableMap(arrayMap);
    }

    public C3724y8(C2313d c2313d, C3065gg c3065gg, InterfaceC3324ng interfaceC3324ng) {
        this.f21806b = c2313d;
        this.f21807c = c3065gg;
        this.f21808d = interfaceC3324ng;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:167:0x0327  */
    /* JADX WARN: Code duplicated, block: B:212:0x0405 A[Catch: all -> 0x0623, TryCatch #0 {, blocks: (B:89:0x01ae, B:91:0x01b2, B:92:0x01b7, B:94:0x01ba, B:96:0x01c2, B:97:0x01c7, B:99:0x01ca, B:101:0x01d6, B:102:0x01db, B:104:0x01de, B:106:0x01e6, B:108:0x01f4, B:109:0x0206, B:111:0x0214, B:112:0x0226, B:114:0x0234, B:115:0x0246, B:117:0x0254, B:118:0x0266, B:120:0x0274, B:121:0x0282, B:123:0x0290, B:124:0x0292, B:126:0x0296, B:128:0x029a, B:130:0x02a2, B:133:0x02aa, B:137:0x02ca, B:143:0x02d6, B:212:0x0405, B:214:0x0423, B:216:0x0427, B:218:0x0434, B:220:0x046e, B:252:0x051f, B:259:0x0552, B:260:0x056a, B:261:0x0585, B:263:0x058d, B:264:0x0598, B:265:0x05bc, B:268:0x05bf, B:270:0x05cf, B:272:0x05d9, B:274:0x05e9, B:275:0x05fe, B:271:0x05d4, B:253:0x0526, B:254:0x052d, B:255:0x0534, B:256:0x053d, B:257:0x0543, B:258:0x054a, B:219:0x046b, B:277:0x0600, B:278:0x0605, B:280:0x0607, B:281:0x060c, B:144:0x02dd, B:146:0x02e1, B:174:0x0334, B:185:0x0394, B:187:0x0399, B:189:0x039c, B:191:0x03a1, B:194:0x03a7, B:176:0x0341, B:180:0x0362, B:178:0x034e, B:179:0x035b, B:182:0x036b, B:183:0x0380, B:184:0x038d, B:195:0x03b9, B:201:0x03de, B:207:0x03ef, B:204:0x03e5, B:206:0x03ed, B:198:0x03d6, B:200:0x03dc, B:208:0x03f7, B:209:0x03fd, B:283:0x060e, B:284:0x0613, B:286:0x0615, B:287:0x061a, B:289:0x061c, B:290:0x0621), top: B:316:0x01ae, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:241:0x0509  */
    /* JADX WARN: Code duplicated, block: B:280:0x0607 A[Catch: all -> 0x0623, TryCatch #0 {, blocks: (B:89:0x01ae, B:91:0x01b2, B:92:0x01b7, B:94:0x01ba, B:96:0x01c2, B:97:0x01c7, B:99:0x01ca, B:101:0x01d6, B:102:0x01db, B:104:0x01de, B:106:0x01e6, B:108:0x01f4, B:109:0x0206, B:111:0x0214, B:112:0x0226, B:114:0x0234, B:115:0x0246, B:117:0x0254, B:118:0x0266, B:120:0x0274, B:121:0x0282, B:123:0x0290, B:124:0x0292, B:126:0x0296, B:128:0x029a, B:130:0x02a2, B:133:0x02aa, B:137:0x02ca, B:143:0x02d6, B:212:0x0405, B:214:0x0423, B:216:0x0427, B:218:0x0434, B:220:0x046e, B:252:0x051f, B:259:0x0552, B:260:0x056a, B:261:0x0585, B:263:0x058d, B:264:0x0598, B:265:0x05bc, B:268:0x05bf, B:270:0x05cf, B:272:0x05d9, B:274:0x05e9, B:275:0x05fe, B:271:0x05d4, B:253:0x0526, B:254:0x052d, B:255:0x0534, B:256:0x053d, B:257:0x0543, B:258:0x054a, B:219:0x046b, B:277:0x0600, B:278:0x0605, B:280:0x0607, B:281:0x060c, B:144:0x02dd, B:146:0x02e1, B:174:0x0334, B:185:0x0394, B:187:0x0399, B:189:0x039c, B:191:0x03a1, B:194:0x03a7, B:176:0x0341, B:180:0x0362, B:178:0x034e, B:179:0x035b, B:182:0x036b, B:183:0x0380, B:184:0x038d, B:195:0x03b9, B:201:0x03de, B:207:0x03ef, B:204:0x03e5, B:206:0x03ed, B:198:0x03d6, B:200:0x03dc, B:208:0x03f7, B:209:0x03fd, B:283:0x060e, B:284:0x0613, B:286:0x0615, B:287:0x061a, B:289:0x061c, B:290:0x0621), top: B:316:0x01ae, inners: #1 }] */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
    /* JADX INFO: renamed from: a */
    public final void mo6148a(InterfaceC3410ps interfaceC3410ps, Map map) {
        int[] iArr;
        ViewParent parent;
        byte b;
        byte b2;
        int iM1578b;
        int i;
        int iM1578b2;
        int i2;
        InterfaceC3410ps interfaceC3410ps2 = interfaceC3410ps;
        int iIntValue = f21805a.get((String) map.get("a")).intValue();
        int iMo4719h = 6;
        if (iIntValue != 5) {
            if (iIntValue != 7) {
                if (!this.f21806b.m4842a()) {
                    this.f21806b.m4843b(null);
                    return;
                }
                if (iIntValue == 1) {
                    C3065gg c3065gg = this.f21807c;
                    synchronized (c3065gg.f14561k) {
                        if (c3065gg.f14563m == null) {
                            c3065gg.m7693b("Not an activity context. Cannot resize.");
                            return;
                        }
                        if (c3065gg.f14562l.mo6500r() == null) {
                            c3065gg.m7693b("Webview is not yet available, size is not set.");
                            return;
                        }
                        if (c3065gg.f14562l.mo6500r().m6689d()) {
                            c3065gg.m7693b("Is interstitial. Cannot resize an interstitial.");
                            return;
                        }
                        if (c3065gg.f14562l.mo6432B()) {
                            c3065gg.m7693b("Cannot resize an expanded banner.");
                            return;
                        }
                        if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
                            C2267h1 c2267h1 = C2330u.f10884a.f10889d;
                            c3065gg.f14560j = C2267h1.m4753l((String) map.get("width"));
                        }
                        if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
                            C2267h1 c2267h2 = C2330u.f10884a.f10889d;
                            c3065gg.f14557g = C2267h1.m4753l((String) map.get("height"));
                        }
                        if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                            C2267h1 c2267h3 = C2330u.f10884a.f10889d;
                            c3065gg.f14558h = C2267h1.m4753l((String) map.get("offsetX"));
                        }
                        if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                            C2267h1 c2267h4 = C2330u.f10884a.f10889d;
                            c3065gg.f14559i = C2267h1.m4753l((String) map.get("offsetY"));
                        }
                        if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                            c3065gg.f14554d = Boolean.parseBoolean((String) map.get("allowOffscreen"));
                        }
                        String str = (String) map.get("customClosePosition");
                        if (!TextUtils.isEmpty(str)) {
                            c3065gg.f14553c = str;
                        }
                        if (c3065gg.f14560j < 0 || c3065gg.f14557g < 0) {
                            c3065gg.m7693b("Invalid width and height options. Cannot resize.");
                            return;
                        }
                        Window window = c3065gg.f14563m.getWindow();
                        if (window != null && window.getDecorView() != null) {
                            C2267h1 c2267h5 = C2330u.f10884a.f10889d;
                            int[] iArrM4760s = C2267h1.m4760s(c3065gg.f14563m);
                            int[] iArrM4757p = C2267h1.m4757p(c3065gg.f14563m);
                            int i3 = iArrM4760s[0];
                            int i4 = iArrM4760s[1];
                            int i5 = c3065gg.f14560j;
                            if (i5 < 50 || i5 > i3) {
                                C2622l.m5226A3("Width is too small or too large.");
                            } else {
                                int i6 = c3065gg.f14557g;
                                if (i6 < 50 || i6 > i4) {
                                    C2622l.m5226A3("Height is too small or too large.");
                                } else {
                                    if (i6 != i4 || i5 != i3) {
                                        if (c3065gg.f14554d) {
                                            switch (c3065gg.f14553c) {
                                                case "center":
                                                    b2 = 2;
                                                    break;
                                                case "top-left":
                                                    b2 = 0;
                                                    break;
                                                case "bottom-left":
                                                    b2 = 3;
                                                    break;
                                                case "bottom-right":
                                                    b2 = 5;
                                                    break;
                                                case "bottom-center":
                                                    b2 = 4;
                                                    break;
                                                case "top-center":
                                                    b2 = 1;
                                                    break;
                                                default:
                                                    b2 = -1;
                                                    break;
                                            }
                                            if (b2 == 0) {
                                                iM1578b = c3065gg.f14555e + c3065gg.f14558h;
                                                i = c3065gg.f14556f;
                                            } else if (b2 != 1) {
                                                if (b2 != 2) {
                                                    if (b2 == 3) {
                                                        iM1578b = c3065gg.f14555e + c3065gg.f14558h;
                                                        i2 = c3065gg.f14556f;
                                                    } else if (b2 == 4) {
                                                        iM1578b = ((c3065gg.f14555e + c3065gg.f14558h) + (i5 >> 1)) - 25;
                                                        i2 = c3065gg.f14556f;
                                                    } else if (b2 != 5) {
                                                        iM1578b = outline.m1578b(c3065gg.f14555e, c3065gg.f14558h, i5, -50);
                                                        i = c3065gg.f14556f;
                                                    } else {
                                                        iM1578b = outline.m1578b(c3065gg.f14555e, c3065gg.f14558h, i5, -50);
                                                        i2 = c3065gg.f14556f;
                                                    }
                                                    iM1578b2 = outline.m1578b(i2, c3065gg.f14559i, i6, -50);
                                                } else {
                                                    iM1578b = ((c3065gg.f14555e + c3065gg.f14558h) + (i5 >> 1)) - 25;
                                                    iM1578b2 = ((c3065gg.f14556f + c3065gg.f14559i) + (i6 >> 1)) - 25;
                                                }
                                                if (iM1578b < 0 && iM1578b + 50 <= i3 && iM1578b2 >= iArrM4757p[0] && iM1578b2 + 50 <= iArrM4757p[1]) {
                                                    iArr = new int[]{c3065gg.f14555e + c3065gg.f14558h, c3065gg.f14556f + c3065gg.f14559i};
                                                }
                                            } else {
                                                iM1578b = ((c3065gg.f14555e + c3065gg.f14558h) + (i5 >> 1)) - 25;
                                                i = c3065gg.f14556f;
                                            }
                                            iM1578b2 = c3065gg.f14559i + i;
                                            if (iM1578b < 0) {
                                            }
                                        } else {
                                            int[] iArrM4760s2 = C2267h1.m4760s(c3065gg.f14563m);
                                            int[] iArrM4757p2 = C2267h1.m4757p(c3065gg.f14563m);
                                            int i7 = iArrM4760s2[0];
                                            int i8 = c3065gg.f14555e + c3065gg.f14558h;
                                            int i9 = c3065gg.f14556f + c3065gg.f14559i;
                                            if (i8 < 0) {
                                                i8 = 0;
                                            } else {
                                                int i10 = c3065gg.f14560j;
                                                if (i8 + i10 > i7) {
                                                    i8 = i7 - i10;
                                                }
                                            }
                                            int i11 = iArrM4757p2[0];
                                            if (i9 < i11) {
                                                i9 = i11;
                                            } else {
                                                int i12 = c3065gg.f14557g;
                                                int i13 = i9 + i12;
                                                int i14 = iArrM4757p2[1];
                                                if (i13 > i14) {
                                                    i9 = i14 - i12;
                                                }
                                            }
                                            iArr = new int[]{i8, i9};
                                        }
                                        if (iArr != null) {
                                            c3065gg.m7693b("Resize location out of screen or close button is not visible.");
                                            return;
                                        }
                                        C3331nn c3331nn = gx2.f14692a.f14693b;
                                        int iM7893k = C3331nn.m7893k(c3065gg.f14563m, c3065gg.f14560j);
                                        int iM7893k2 = C3331nn.m7893k(c3065gg.f14563m, c3065gg.f14557g);
                                        parent = ((View) c3065gg.f14562l).getParent();
                                        if (parent != null || !(parent instanceof ViewGroup)) {
                                            c3065gg.m7693b("Webview is detached, probably in the middle of a resize or expand.");
                                            return;
                                        }
                                        ViewGroup viewGroup = (ViewGroup) parent;
                                        viewGroup.removeView((View) c3065gg.f14562l);
                                        PopupWindow popupWindow = c3065gg.f14568r;
                                        if (popupWindow == null) {
                                            c3065gg.f14570t = viewGroup;
                                            Object obj = c3065gg.f14562l;
                                            ((View) obj).setDrawingCacheEnabled(true);
                                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((View) obj).getDrawingCache());
                                            ((View) obj).setDrawingCacheEnabled(false);
                                            ImageView imageView = new ImageView(c3065gg.f14563m);
                                            c3065gg.f14565o = imageView;
                                            imageView.setImageBitmap(bitmapCreateBitmap);
                                            c3065gg.f14564n = c3065gg.f14562l.mo6500r();
                                            c3065gg.f14570t.addView(c3065gg.f14565o);
                                        } else {
                                            popupWindow.dismiss();
                                        }
                                        RelativeLayout relativeLayout = new RelativeLayout(c3065gg.f14563m);
                                        c3065gg.f14569s = relativeLayout;
                                        relativeLayout.setBackgroundColor(0);
                                        c3065gg.f14569s.setLayoutParams(new ViewGroup.LayoutParams(iM7893k, iM7893k2));
                                        PopupWindow popupWindow2 = new PopupWindow((View) c3065gg.f14569s, iM7893k, iM7893k2, false);
                                        c3065gg.f14568r = popupWindow2;
                                        popupWindow2.setOutsideTouchable(true);
                                        c3065gg.f14568r.setTouchable(true);
                                        c3065gg.f14568r.setClippingEnabled(!c3065gg.f14554d);
                                        c3065gg.f14569s.addView((View) c3065gg.f14562l, -1, -1);
                                        c3065gg.f14566p = new LinearLayout(c3065gg.f14563m);
                                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C3331nn.m7893k(c3065gg.f14563m, 50), C3331nn.m7893k(c3065gg.f14563m, 50));
                                        switch (c3065gg.f14553c) {
                                            case "center":
                                                b = 2;
                                                break;
                                            case "top-left":
                                                b = 0;
                                                break;
                                            case "bottom-left":
                                                b = 3;
                                                break;
                                            case "bottom-right":
                                                b = 5;
                                                break;
                                            case "bottom-center":
                                                b = 4;
                                                break;
                                            case "top-center":
                                                b = 1;
                                                break;
                                            default:
                                                b = -1;
                                                break;
                                        }
                                        if (b == 0) {
                                            layoutParams.addRule(10);
                                            layoutParams.addRule(9);
                                        } else if (b == 1) {
                                            layoutParams.addRule(10);
                                            layoutParams.addRule(14);
                                        } else if (b == 2) {
                                            layoutParams.addRule(13);
                                        } else if (b == 3) {
                                            layoutParams.addRule(12);
                                            layoutParams.addRule(9);
                                        } else if (b == 4) {
                                            layoutParams.addRule(12);
                                            layoutParams.addRule(14);
                                        } else if (b != 5) {
                                            layoutParams.addRule(10);
                                            layoutParams.addRule(11);
                                        } else {
                                            layoutParams.addRule(12);
                                            layoutParams.addRule(11);
                                        }
                                        c3065gg.f14566p.setOnClickListener(new ViewOnClickListenerC3028fg(c3065gg));
                                        c3065gg.f14566p.setContentDescription("Close button");
                                        c3065gg.f14569s.addView(c3065gg.f14566p, layoutParams);
                                        try {
                                            c3065gg.f14568r.showAtLocation(window.getDecorView(), 0, C3331nn.m7893k(c3065gg.f14563m, iArr[0]), C3331nn.m7893k(c3065gg.f14563m, iArr[1]));
                                            int i15 = iArr[0];
                                            int i16 = iArr[1];
                                            InterfaceC3324ng interfaceC3324ng = c3065gg.f14567q;
                                            if (interfaceC3324ng != null) {
                                                ((wl0) interfaceC3324ng).f21257a.f21583b.m7108A0(k70.f15893a);
                                            }
                                            c3065gg.f14562l.mo6437D0(C3005eu.m6688c(iM7893k, iM7893k2));
                                            c3065gg.m7694c(iArr[0], iArr[1] - C2267h1.m4757p(c3065gg.f14563m)[0], c3065gg.f14560j, c3065gg.f14557g);
                                            c3065gg.m7695d("resized");
                                            return;
                                        } catch (RuntimeException e) {
                                            String strValueOf = String.valueOf(e.getMessage());
                                            c3065gg.m7693b(strValueOf.length() != 0 ? "Cannot show popup window: ".concat(strValueOf) : new String("Cannot show popup window: "));
                                            c3065gg.f14569s.removeView((View) c3065gg.f14562l);
                                            ViewGroup viewGroup2 = c3065gg.f14570t;
                                            if (viewGroup2 != null) {
                                                viewGroup2.removeView(c3065gg.f14565o);
                                                c3065gg.f14570t.addView((View) c3065gg.f14562l);
                                                c3065gg.f14562l.mo6437D0(c3065gg.f14564n);
                                            }
                                            return;
                                        }
                                    }
                                    C2622l.m5226A3("Cannot resize to a full-screen ad.");
                                }
                            }
                            iArr = null;
                            if (iArr != null) {
                                c3065gg.m7693b("Resize location out of screen or close button is not visible.");
                                return;
                            }
                            C3331nn c3331nn2 = gx2.f14692a.f14693b;
                            int iM7893k3 = C3331nn.m7893k(c3065gg.f14563m, c3065gg.f14560j);
                            int iM7893k4 = C3331nn.m7893k(c3065gg.f14563m, c3065gg.f14557g);
                            parent = ((View) c3065gg.f14562l).getParent();
                            if (parent != null) {
                            }
                            c3065gg.m7693b("Webview is detached, probably in the middle of a resize or expand.");
                            return;
                        }
                        c3065gg.m7693b("Activity context is not ready, cannot get window or decor view.");
                        return;
                    }
                }
                if (iIntValue == 3) {
                    C3176jg c3176jg = new C3176jg(interfaceC3410ps2, map);
                    Context context = c3176jg.f15591d;
                    if (context == null) {
                        c3176jg.m7693b("Activity context is not available");
                        return;
                    }
                    C2330u c2330u = C2330u.f10884a;
                    C2267h1 c2267h6 = c2330u.f10889d;
                    if (!new C3458r2(context).m8242a()) {
                        c3176jg.m7693b("Feature is not supported by the device.");
                        return;
                    }
                    String str2 = c3176jg.f15590c.get("iurl");
                    if (TextUtils.isEmpty(str2)) {
                        c3176jg.m7693b("Image url cannot be empty.");
                        return;
                    }
                    if (!URLUtil.isValidUrl(str2)) {
                        String strValueOf2 = String.valueOf(str2);
                        c3176jg.m7693b(strValueOf2.length() != 0 ? "Invalid image url: ".concat(strValueOf2) : new String("Invalid image url: "));
                        return;
                    }
                    String lastPathSegment = Uri.parse(str2).getLastPathSegment();
                    if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                        String strValueOf3 = String.valueOf(lastPathSegment);
                        c3176jg.m7693b(strValueOf3.length() != 0 ? "Image type not recognized: ".concat(strValueOf3) : new String("Image type not recognized: "));
                        return;
                    }
                    Resources resourcesM6646c = c2330u.f10893h.m6646c();
                    AlertDialog.Builder builder = new AlertDialog.Builder(c3176jg.f15591d);
                    builder.setTitle(resourcesM6646c != null ? resourcesM6646c.getString(R.string.f33402s1) : "Save image");
                    builder.setMessage(resourcesM6646c != null ? resourcesM6646c.getString(R.string.f33403s2) : "Allow Ad to store image in Picture gallery?");
                    builder.setPositiveButton(resourcesM6646c != null ? resourcesM6646c.getString(R.string.f33404s3) : "Accept", new DialogInterfaceOnClickListenerC3102hg(c3176jg, str2, lastPathSegment));
                    builder.setNegativeButton(resourcesM6646c != null ? resourcesM6646c.getString(R.string.f33405s4) : "Decline", new DialogInterfaceOnClickListenerC3139ig(c3176jg));
                    builder.create().show();
                    return;
                }
                if (iIntValue == 4) {
                    C2991eg c2991eg = new C2991eg(interfaceC3410ps2, map);
                    Context context2 = c2991eg.f13580d;
                    if (context2 == null) {
                        c2991eg.m7693b("Activity context is not available.");
                        return;
                    }
                    C2330u c2330u2 = C2330u.f10884a;
                    C2267h1 c2267h7 = c2330u2.f10889d;
                    if (!new C3458r2(context2).m8243b()) {
                        c2991eg.m7693b("This feature is not available on the device.");
                        return;
                    }
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(c2991eg.f13580d);
                    Resources resourcesM6646c2 = c2330u2.f10893h.m6646c();
                    builder2.setTitle(resourcesM6646c2 != null ? resourcesM6646c2.getString(R.string.f33406s5) : "Create calendar event");
                    builder2.setMessage(resourcesM6646c2 != null ? resourcesM6646c2.getString(R.string.f33407s6) : "Allow Ad to create a calendar event?");
                    builder2.setPositiveButton(resourcesM6646c2 != null ? resourcesM6646c2.getString(R.string.f33404s3) : "Accept", new DialogInterfaceOnClickListenerC2917cg(c2991eg));
                    builder2.setNegativeButton(resourcesM6646c2 != null ? resourcesM6646c2.getString(R.string.f33405s4) : "Decline", new DialogInterfaceOnClickListenerC2954dg(c2991eg));
                    builder2.create().show();
                    return;
                }
                if (iIntValue != 5) {
                    if (iIntValue == 6) {
                        this.f21807c.m6996f(true);
                        return;
                    } else if (iIntValue != 7) {
                        C2622l.m5458x3("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            ((wl0) this.f21808d).f21257a.f21593l.m7108A0(j90.f15509a);
            return;
        }
        String str3 = (String) map.get("forceOrientation");
        boolean z = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (interfaceC3410ps2 == null) {
            C2622l.m5226A3("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str3)) {
            iMo4719h = 7;
        } else if (!"landscape".equalsIgnoreCase(str3)) {
            iMo4719h = z ? -1 : C2330u.f10884a.f10891f.mo4719h();
        }
        interfaceC3410ps2.mo6438E(iMo4719h);
    }
}
