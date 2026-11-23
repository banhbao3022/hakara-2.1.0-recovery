package p636z0.p697i.p700b.p701h;

import java.util.ArrayList;
import p636z0.p697i.p700b.ArrayRow;
import p636z0.p697i.p700b.LinearSystem;
import p636z0.p697i.p700b.SolverVariable;

/* JADX INFO: renamed from: z0.i.b.h.b, reason: use source file name */
/* JADX INFO: compiled from: Chain.java */
/* JADX INFO: loaded from: classes.dex */
public class Chain {
    /* JADX WARN: Code duplicated, block: B:125:0x01eb A[PHI: r23 r24
  0x01eb: PHI (r23v3 boolean) = (r23v1 boolean), (r23v7 boolean) binds: [B:124:0x01e9, B:115:0x01d3] A[DONT_GENERATE, DONT_INLINE]
  0x01eb: PHI (r24v3 boolean) = (r24v1 boolean), (r24v6 boolean) binds: [B:124:0x01e9, B:115:0x01d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:126:0x01ed A[PHI: r23 r24
  0x01ed: PHI (r23v5 boolean) = (r23v1 boolean), (r23v7 boolean) binds: [B:124:0x01e9, B:115:0x01d3] A[DONT_GENERATE, DONT_INLINE]
  0x01ed: PHI (r24v5 boolean) = (r24v1 boolean), (r24v6 boolean) binds: [B:124:0x01e9, B:115:0x01d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:174:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:194:0x030a  */
    /* JADX WARN: Code duplicated, block: B:196:0x030d  */
    /* JADX WARN: Code duplicated, block: B:198:0x0313  */
    /* JADX WARN: Code duplicated, block: B:200:0x0334  */
    /* JADX WARN: Code duplicated, block: B:286:0x0511  */
    /* JADX WARN: Code duplicated, block: B:72:0x013c  */
    /* JADX INFO: renamed from: a */
    public static void m15724a(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ArrayList<ConstraintWidget> arrayList, int i) {
        int i2;
        ChainHead[] chainHeadArr;
        int i3;
        boolean z;
        int i4;
        boolean z2;
        boolean z3;
        int i5;
        int i6;
        ChainHead[] chainHeadArr2;
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        int i7;
        ConstraintWidget constraintWidget4;
        ConstraintAnchor constraintAnchor;
        SolverVariable solverVariable;
        SolverVariable solverVariable2;
        ConstraintAnchor constraintAnchor2;
        SolverVariable solverVariable3;
        SolverVariable solverVariable4;
        int size;
        float f;
        ConstraintAnchor constraintAnchor3;
        ConstraintWidget constraintWidget5;
        int i8;
        int i9;
        ConstraintWidget constraintWidget6;
        int iM15760m;
        ConstraintWidgetContainer constraintWidgetContainer2 = constraintWidgetContainer;
        int i10 = 2;
        if (i == 0) {
            i2 = constraintWidgetContainer2.f36905u0;
            chainHeadArr = constraintWidgetContainer2.f36908x0;
            i3 = 0;
        } else {
            i2 = constraintWidgetContainer2.f36906v0;
            chainHeadArr = constraintWidgetContainer2.f36907w0;
            i3 = 2;
        }
        int i11 = 0;
        while (i11 < i2) {
            ChainHead chainHead = chainHeadArr[i11];
            int i12 = 8;
            int i13 = 1;
            if (!chainHead.f36808t) {
                int i14 = chainHead.f36803o * 2;
                ConstraintWidget constraintWidget7 = chainHead.f36789a;
                ConstraintWidget constraintWidget8 = constraintWidget7;
                boolean z4 = false;
                while (!z4) {
                    chainHead.f36797i += i13;
                    ConstraintWidget[] constraintWidgetArr = constraintWidget7.f36873j0;
                    int i15 = chainHead.f36803o;
                    constraintWidgetArr[i15] = null;
                    constraintWidget7.f36871i0[i15] = null;
                    if (constraintWidget7.f36861d0 != i12) {
                        chainHead.f36800l += i13;
                        if (constraintWidget7.m15759l(i15) != 3) {
                            int i16 = chainHead.f36801m;
                            int i17 = chainHead.f36803o;
                            if (i17 == 0) {
                                iM15760m = constraintWidget7.m15766s();
                            } else {
                                iM15760m = i17 == i13 ? constraintWidget7.m15760m() : 0;
                            }
                            chainHead.f36801m = i16 + iM15760m;
                        }
                        int iM15728d = constraintWidget7.f36840M[i14].m15728d() + chainHead.f36801m;
                        chainHead.f36801m = iM15728d;
                        int i18 = i14 + 1;
                        chainHead.f36801m = constraintWidget7.f36840M[i18].m15728d() + iM15728d;
                        int iM15728d2 = constraintWidget7.f36840M[i14].m15728d() + chainHead.f36802n;
                        chainHead.f36802n = iM15728d2;
                        chainHead.f36802n = constraintWidget7.f36840M[i18].m15728d() + iM15728d2;
                        if (chainHead.f36790b == null) {
                            chainHead.f36790b = constraintWidget7;
                        }
                        chainHead.f36792d = constraintWidget7;
                        int[] iArr = constraintWidget7.f36843P;
                        int i19 = chainHead.f36803o;
                        if (iArr[i19] == 3) {
                            int[] iArr2 = constraintWidget7.f36880o;
                            if (iArr2[i19] == 0 || iArr2[i19] == 3 || iArr2[i19] == i10) {
                                chainHead.f36798j++;
                                float[] fArr = constraintWidget7.f36869h0;
                                float f2 = fArr[i19];
                                if (f2 > 0.0f) {
                                    chainHead.f36799k += fArr[i19];
                                }
                                if (constraintWidget7.f36861d0 != 8 && iArr[i19] == 3 && (iArr2[i19] == 0 || iArr2[i19] == 3)) {
                                    if (f2 < 0.0f) {
                                        chainHead.f36805q = true;
                                    } else {
                                        chainHead.f36806r = true;
                                    }
                                    if (chainHead.f36796h == null) {
                                        chainHead.f36796h = new ArrayList<>();
                                    }
                                    chainHead.f36796h.add(constraintWidget7);
                                }
                                if (chainHead.f36794f == null) {
                                    chainHead.f36794f = constraintWidget7;
                                }
                                ConstraintWidget constraintWidget9 = chainHead.f36795g;
                                if (constraintWidget9 != null) {
                                    constraintWidget9.f36871i0[chainHead.f36803o] = constraintWidget7;
                                }
                                chainHead.f36795g = constraintWidget7;
                            }
                            int i20 = chainHead.f36803o;
                        }
                    }
                    if (constraintWidget8 != constraintWidget7) {
                        constraintWidget8.f36873j0[chainHead.f36803o] = constraintWidget7;
                    }
                    ConstraintAnchor constraintAnchor4 = constraintWidget7.f36840M[i14 + 1].f36814f;
                    if (constraintAnchor4 != null) {
                        constraintWidget6 = constraintAnchor4.f36812d;
                        ConstraintAnchor[] constraintAnchorArr = constraintWidget6.f36840M;
                        if (constraintAnchorArr[i14].f36814f == null || constraintAnchorArr[i14].f36814f.f36812d != constraintWidget7) {
                            constraintWidget6 = null;
                        }
                    } else {
                        constraintWidget6 = null;
                    }
                    if (constraintWidget6 == null) {
                        constraintWidget6 = constraintWidget7;
                        z4 = true;
                    }
                    constraintWidget8 = constraintWidget7;
                    i13 = 1;
                    i12 = 8;
                    i10 = 2;
                    constraintWidget7 = constraintWidget6;
                }
                ConstraintWidget constraintWidget10 = chainHead.f36790b;
                if (constraintWidget10 != null) {
                    chainHead.f36801m -= constraintWidget10.f36840M[i14].m15728d();
                }
                ConstraintWidget constraintWidget11 = chainHead.f36792d;
                if (constraintWidget11 != null) {
                    chainHead.f36801m -= constraintWidget11.f36840M[i14 + 1].m15728d();
                }
                chainHead.f36791c = constraintWidget7;
                if (chainHead.f36803o == 0 && chainHead.f36804p) {
                    chainHead.f36793e = constraintWidget7;
                } else {
                    chainHead.f36793e = chainHead.f36789a;
                }
                chainHead.f36807s = chainHead.f36806r && chainHead.f36805q;
            }
            chainHead.f36808t = true;
            if (arrayList == 0 || arrayList.contains(chainHead.f36789a)) {
                ConstraintWidget constraintWidget12 = chainHead.f36789a;
                ConstraintWidget constraintWidget13 = chainHead.f36791c;
                ConstraintWidget constraintWidget14 = chainHead.f36790b;
                ConstraintWidget constraintWidget15 = chainHead.f36792d;
                ConstraintWidget constraintWidget16 = chainHead.f36793e;
                float f3 = chainHead.f36799k;
                boolean z5 = constraintWidgetContainer2.f36843P[i] == 2;
                if (i == 0) {
                    int i21 = constraintWidget16.f36865f0;
                    boolean z6 = i21 == 0;
                    if (i21 == 1) {
                        i9 = 2;
                        z2 = true;
                    } else {
                        i9 = 2;
                        z2 = false;
                    }
                    z = z6;
                    if (i21 == i9) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } else {
                    int i22 = constraintWidget16.f36867g0;
                    z = i22 == 0;
                    if (i22 == 1) {
                        i4 = 2;
                        z2 = true;
                    } else {
                        i4 = 2;
                        z2 = false;
                    }
                    if (i22 == i4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                ConstraintWidget constraintWidget17 = constraintWidget12;
                boolean z7 = false;
                while (!z7) {
                    ConstraintAnchor constraintAnchor5 = constraintWidget17.f36840M[i3];
                    int i23 = z3 ? 1 : 4;
                    int iM15728d3 = constraintAnchor5.m15728d();
                    int i24 = i11;
                    boolean z8 = constraintWidget17.f36843P[i] == 3 && constraintWidget17.f36880o[i] == 0;
                    ConstraintAnchor constraintAnchor6 = constraintAnchor5.f36814f;
                    if (constraintAnchor6 != null && constraintWidget17 != constraintWidget12) {
                        iM15728d3 = constraintAnchor6.m15728d() + iM15728d3;
                    }
                    int i25 = iM15728d3;
                    if (z3 && constraintWidget17 != constraintWidget12 && constraintWidget17 != constraintWidget14) {
                        i23 = 8;
                    }
                    ConstraintAnchor constraintAnchor7 = constraintAnchor5.f36814f;
                    if (constraintAnchor7 != null) {
                        if (constraintWidget17 == constraintWidget14) {
                            linearSystem.m15693f(constraintAnchor5.f36817i, constraintAnchor7.f36817i, i25, 6);
                        } else {
                            linearSystem.m15693f(constraintAnchor5.f36817i, constraintAnchor7.f36817i, i25, 8);
                        }
                        linearSystem.m15691d(constraintAnchor5.f36817i, constraintAnchor5.f36814f.f36817i, i25, (!z8 || z3) ? i23 : 5);
                    } else {
                        constraintWidget16 = constraintWidget16;
                        chainHeadArr = chainHeadArr;
                    }
                    if (z5) {
                        if (constraintWidget17.f36861d0 == 8 || constraintWidget17.f36843P[i] != 3) {
                            i8 = 0;
                        } else {
                            ConstraintAnchor[] constraintAnchorArr2 = constraintWidget17.f36840M;
                            i8 = 0;
                            linearSystem.m15693f(constraintAnchorArr2[i3 + 1].f36817i, constraintAnchorArr2[i3].f36817i, 0, 5);
                        }
                        linearSystem.m15693f(constraintWidget17.f36840M[i3].f36817i, constraintWidgetContainer2.f36840M[i3].f36817i, i8, 8);
                    }
                    ConstraintAnchor constraintAnchor8 = constraintWidget17.f36840M[i3 + 1].f36814f;
                    if (constraintAnchor8 != null) {
                        constraintWidget5 = constraintAnchor8.f36812d;
                        ConstraintAnchor[] constraintAnchorArr3 = constraintWidget5.f36840M;
                        if (constraintAnchorArr3[i3].f36814f == null || constraintAnchorArr3[i3].f36814f.f36812d != constraintWidget17) {
                            constraintWidget5 = null;
                        }
                    } else {
                        constraintWidget5 = null;
                    }
                    if (constraintWidget5 != null) {
                        constraintWidget17 = constraintWidget5;
                    } else {
                        z7 = true;
                    }
                    i2 = i2;
                    i11 = i24;
                    chainHeadArr = chainHeadArr;
                    constraintWidget16 = constraintWidget16;
                }
                ConstraintWidget constraintWidget18 = constraintWidget16;
                i5 = i11;
                i6 = i2;
                chainHeadArr2 = chainHeadArr;
                if (constraintWidget15 != null) {
                    int i26 = i3 + 1;
                    if (constraintWidget13.f36840M[i26].f36814f != null) {
                        ConstraintAnchor constraintAnchor9 = constraintWidget15.f36840M[i26];
                        if ((constraintWidget15.f36843P[i] == 3 && constraintWidget15.f36880o[i] == 0) && !z3) {
                            ConstraintAnchor constraintAnchor10 = constraintAnchor9.f36814f;
                            if (constraintAnchor10.f36812d == constraintWidgetContainer2) {
                                linearSystem.m15691d(constraintAnchor9.f36817i, constraintAnchor10.f36817i, -constraintAnchor9.m15728d(), 5);
                            } else if (z3) {
                                constraintAnchor3 = constraintAnchor9.f36814f;
                                if (constraintAnchor3.f36812d == constraintWidgetContainer2) {
                                    linearSystem.m15691d(constraintAnchor9.f36817i, constraintAnchor3.f36817i, -constraintAnchor9.m15728d(), 4);
                                }
                            }
                        } else if (z3) {
                            constraintAnchor3 = constraintAnchor9.f36814f;
                            if (constraintAnchor3.f36812d == constraintWidgetContainer2) {
                                linearSystem.m15691d(constraintAnchor9.f36817i, constraintAnchor3.f36817i, -constraintAnchor9.m15728d(), 4);
                            }
                        }
                        linearSystem.m15694g(constraintAnchor9.f36817i, constraintWidget13.f36840M[i26].f36814f.f36817i, -constraintAnchor9.m15728d(), 6);
                    }
                }
                if (z5) {
                    int i27 = i3 + 1;
                    SolverVariable solverVariable5 = constraintWidgetContainer2.f36840M[i27].f36817i;
                    ConstraintAnchor[] constraintAnchorArr4 = constraintWidget13.f36840M;
                    linearSystem.m15693f(solverVariable5, constraintAnchorArr4[i27].f36817i, constraintAnchorArr4[i27].m15728d(), 8);
                }
                ArrayList<ConstraintWidget> arrayList2 = chainHead.f36796h;
                if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                    float f4 = (!chainHead.f36805q || chainHead.f36807s) ? f3 : chainHead.f36798j;
                    ConstraintWidget constraintWidget19 = null;
                    float f5 = 0.0f;
                    int i28 = 0;
                    while (i28 < size) {
                        ConstraintWidget constraintWidget20 = arrayList2.get(i28);
                        float f6 = constraintWidget20.f36869h0[i];
                        if (f6 < 0.0f) {
                            if (chainHead.f36807s) {
                                ConstraintAnchor[] constraintAnchorArr5 = constraintWidget20.f36840M;
                                arrayList2 = arrayList2;
                                linearSystem.m15691d(constraintAnchorArr5[i3 + 1].f36817i, constraintAnchorArr5[i3].f36817i, 0, 4);
                            } else {
                                f = 0.0f;
                                f6 = 1.0f;
                            }
                            chainHead = chainHead;
                            size = size;
                            constraintWidget13 = constraintWidget13;
                            i28++;
                            arrayList2 = arrayList2;
                            constraintWidget13 = constraintWidget13;
                            size = size;
                            chainHead = chainHead;
                        } else {
                            f = 0.0f;
                        }
                        if (f6 == f) {
                            ConstraintAnchor[] constraintAnchorArr6 = constraintWidget20.f36840M;
                            linearSystem.m15691d(constraintAnchorArr6[i3 + 1].f36817i, constraintAnchorArr6[i3].f36817i, 0, 8);
                            chainHead = chainHead;
                            size = size;
                            constraintWidget13 = constraintWidget13;
                        } else {
                            if (constraintWidget19 != null) {
                                ConstraintAnchor[] constraintAnchorArr7 = constraintWidget19.f36840M;
                                SolverVariable solverVariable6 = constraintAnchorArr7[i3].f36817i;
                                int i29 = i3 + 1;
                                SolverVariable solverVariable7 = constraintAnchorArr7[i29].f36817i;
                                ConstraintAnchor[] constraintAnchorArr8 = constraintWidget20.f36840M;
                                SolverVariable solverVariable8 = constraintAnchorArr8[i3].f36817i;
                                SolverVariable solverVariable9 = constraintAnchorArr8[i29].f36817i;
                                ArrayRow arrayRowM15700m = linearSystem.m15700m();
                                arrayRowM15700m.f36729b = 0.0f;
                                if (f4 == 0.0f || f5 == f6) {
                                    arrayRowM15700m.f36731d.mo15673i(solverVariable6, 1.0f);
                                    arrayRowM15700m.f36731d.mo15673i(solverVariable7, -1.0f);
                                    arrayRowM15700m.f36731d.mo15673i(solverVariable9, 1.0f);
                                    arrayRowM15700m.f36731d.mo15673i(solverVariable8, -1.0f);
                                } else if (f5 == 0.0f) {
                                    arrayRowM15700m.f36731d.mo15673i(solverVariable6, 1.0f);
                                    arrayRowM15700m.f36731d.mo15673i(solverVariable7, -1.0f);
                                } else if (f6 == f) {
                                    arrayRowM15700m.f36731d.mo15673i(solverVariable8, 1.0f);
                                    arrayRowM15700m.f36731d.mo15673i(solverVariable9, -1.0f);
                                } else {
                                    float f7 = (f5 / f4) / (f6 / f4);
                                    arrayRowM15700m.f36731d.mo15673i(solverVariable6, 1.0f);
                                    arrayRowM15700m.f36731d.mo15673i(solverVariable7, -1.0f);
                                    arrayRowM15700m.f36731d.mo15673i(solverVariable9, f7);
                                    arrayRowM15700m.f36731d.mo15673i(solverVariable8, -f7);
                                }
                                linearSystem.m15690c(arrayRowM15700m);
                            }
                            f5 = f6;
                            constraintWidget19 = constraintWidget20;
                        }
                        i28++;
                        arrayList2 = arrayList2;
                        constraintWidget13 = constraintWidget13;
                        size = size;
                        chainHead = chainHead;
                    }
                }
                ChainHead chainHead2 = chainHead;
                ConstraintWidget constraintWidget21 = constraintWidget13;
                if (constraintWidget14 == null || !(constraintWidget14 == constraintWidget15 || z3)) {
                    constraintWidget = constraintWidget15;
                    constraintWidget2 = constraintWidget14;
                    constraintWidget3 = constraintWidget21;
                    i7 = i5;
                    if (!z || constraintWidget2 == null) {
                        i5 = i7;
                        if (z2 && constraintWidget2 != null) {
                            int i30 = chainHead2.f36798j;
                            boolean z9 = i30 > 0 && chainHead2.f36797i == i30;
                            ConstraintWidget constraintWidget22 = constraintWidget2;
                            ConstraintWidget constraintWidget23 = constraintWidget22;
                            while (constraintWidget22 != null) {
                                ConstraintWidget constraintWidget24 = constraintWidget22.f36873j0[i];
                                while (constraintWidget24 != null && constraintWidget24.f36861d0 == 8) {
                                    constraintWidget24 = constraintWidget24.f36873j0[i];
                                }
                                if (constraintWidget22 == constraintWidget2 || constraintWidget22 == constraintWidget || constraintWidget24 == null) {
                                    constraintWidget4 = constraintWidget24;
                                } else {
                                    ConstraintWidget constraintWidget25 = constraintWidget24 == constraintWidget ? null : constraintWidget24;
                                    ConstraintAnchor constraintAnchor11 = constraintWidget22.f36840M[i3];
                                    SolverVariable solverVariable10 = constraintAnchor11.f36817i;
                                    int i31 = i3 + 1;
                                    SolverVariable solverVariable11 = constraintWidget23.f36840M[i31].f36817i;
                                    int iM15728d4 = constraintAnchor11.m15728d();
                                    int iM15728d5 = constraintWidget22.f36840M[i31].m15728d();
                                    if (constraintWidget25 != null) {
                                        constraintAnchor = constraintWidget25.f36840M[i3];
                                        solverVariable = constraintAnchor.f36817i;
                                        ConstraintAnchor constraintAnchor12 = constraintAnchor.f36814f;
                                        solverVariable2 = constraintAnchor12 != null ? constraintAnchor12.f36817i : null;
                                    } else {
                                        constraintAnchor = constraintWidget.f36840M[i3];
                                        solverVariable = constraintAnchor != null ? constraintAnchor.f36817i : null;
                                        solverVariable2 = constraintWidget22.f36840M[i31].f36817i;
                                    }
                                    int iM15728d6 = constraintAnchor != null ? constraintAnchor.m15728d() + iM15728d5 : iM15728d5;
                                    int iM15728d7 = constraintWidget23.f36840M[i31].m15728d() + iM15728d4;
                                    int i32 = z9 ? 8 : 4;
                                    if (solverVariable10 != null && solverVariable11 != null && solverVariable != null && solverVariable2 != null) {
                                        linearSystem.m15689b(solverVariable10, solverVariable11, iM15728d7, 0.5f, solverVariable, solverVariable2, iM15728d6, i32);
                                    }
                                    constraintWidget4 = constraintWidget25;
                                }
                                if (constraintWidget22.f36861d0 != 8) {
                                    constraintWidget23 = constraintWidget22;
                                }
                                constraintWidget22 = constraintWidget4;
                            }
                            ConstraintAnchor constraintAnchor13 = constraintWidget2.f36840M[i3];
                            ConstraintAnchor constraintAnchor14 = constraintWidget12.f36840M[i3].f36814f;
                            int i33 = i3 + 1;
                            ConstraintAnchor constraintAnchor15 = constraintWidget.f36840M[i33];
                            ConstraintAnchor constraintAnchor16 = constraintWidget3.f36840M[i33].f36814f;
                            if (constraintAnchor14 != null) {
                                if (constraintWidget2 != constraintWidget) {
                                    linearSystem.m15691d(constraintAnchor13.f36817i, constraintAnchor14.f36817i, constraintAnchor13.m15728d(), 5);
                                } else if (constraintAnchor16 != null) {
                                    linearSystem.m15689b(constraintAnchor13.f36817i, constraintAnchor14.f36817i, constraintAnchor13.m15728d(), 0.5f, constraintAnchor15.f36817i, constraintAnchor16.f36817i, constraintAnchor15.m15728d(), 5);
                                }
                            }
                            if (constraintAnchor16 != null && constraintWidget2 != constraintWidget) {
                                linearSystem.m15691d(constraintAnchor15.f36817i, constraintAnchor16.f36817i, -constraintAnchor15.m15728d(), 5);
                            }
                        }
                    } else {
                        int i34 = chainHead2.f36798j;
                        boolean z10 = i34 > 0 && chainHead2.f36797i == i34;
                        ConstraintWidget constraintWidget26 = constraintWidget2;
                        ConstraintWidget constraintWidget27 = constraintWidget26;
                        while (constraintWidget27 != null) {
                            ConstraintWidget constraintWidget28 = constraintWidget27.f36873j0[i];
                            while (constraintWidget28 != null && constraintWidget28.f36861d0 == 8) {
                                constraintWidget28 = constraintWidget28.f36873j0[i];
                            }
                            if (constraintWidget28 != null || constraintWidget27 == constraintWidget) {
                                ConstraintAnchor constraintAnchor17 = constraintWidget27.f36840M[i3];
                                SolverVariable solverVariable12 = constraintAnchor17.f36817i;
                                ConstraintAnchor constraintAnchor18 = constraintAnchor17.f36814f;
                                SolverVariable solverVariable13 = constraintAnchor18 != null ? constraintAnchor18.f36817i : null;
                                if (constraintWidget26 != constraintWidget27) {
                                    solverVariable13 = constraintWidget26.f36840M[i3 + 1].f36817i;
                                } else if (constraintWidget27 == constraintWidget2 && constraintWidget26 == constraintWidget27) {
                                    ConstraintAnchor[] constraintAnchorArr9 = constraintWidget12.f36840M;
                                    solverVariable13 = constraintAnchorArr9[i3].f36814f != null ? constraintAnchorArr9[i3].f36814f.f36817i : null;
                                }
                                int iM15728d8 = constraintAnchor17.m15728d();
                                int i35 = i3 + 1;
                                int iM15728d9 = constraintWidget27.f36840M[i35].m15728d();
                                if (constraintWidget28 != null) {
                                    ConstraintAnchor constraintAnchor19 = constraintWidget28.f36840M[i3];
                                    solverVariable3 = constraintAnchor19.f36817i;
                                    constraintAnchor2 = constraintAnchor19;
                                    solverVariable4 = constraintWidget27.f36840M[i35].f36817i;
                                } else {
                                    constraintAnchor2 = constraintWidget3.f36840M[i35].f36814f;
                                    solverVariable3 = constraintAnchor2 != null ? constraintAnchor2.f36817i : null;
                                    solverVariable4 = constraintWidget27.f36840M[i35].f36817i;
                                }
                                ConstraintAnchor constraintAnchor20 = constraintAnchor2;
                                SolverVariable solverVariable14 = solverVariable4;
                                if (constraintAnchor20 != null) {
                                    iM15728d9 += constraintAnchor20.m15728d();
                                }
                                if (constraintWidget26 != null) {
                                    iM15728d8 += constraintWidget26.f36840M[i35].m15728d();
                                }
                                if (solverVariable12 != null && solverVariable13 != null && solverVariable3 != null && solverVariable14 != null) {
                                    if (constraintWidget27 == constraintWidget2) {
                                        iM15728d8 = constraintWidget2.f36840M[i3].m15728d();
                                    }
                                    linearSystem.m15689b(solverVariable12, solverVariable13, iM15728d8, 0.5f, solverVariable3, solverVariable14, constraintWidget27 == constraintWidget ? constraintWidget.f36840M[i35].m15728d() : iM15728d9, z10 ? 8 : 5);
                                }
                            }
                            constraintWidget26 = constraintWidget27.f36861d0 != 8 ? constraintWidget27 : constraintWidget26;
                            constraintWidget27 = constraintWidget28;
                            i7 = i7;
                        }
                        i5 = i7;
                    }
                } else {
                    ConstraintAnchor constraintAnchor21 = constraintWidget12.f36840M[i3];
                    constraintWidget3 = constraintWidget21;
                    int i36 = i3 + 1;
                    ConstraintAnchor constraintAnchor22 = constraintWidget3.f36840M[i36];
                    ConstraintAnchor constraintAnchor23 = constraintAnchor21.f36814f;
                    SolverVariable solverVariable15 = constraintAnchor23 != null ? constraintAnchor23.f36817i : null;
                    ConstraintAnchor constraintAnchor24 = constraintAnchor22.f36814f;
                    SolverVariable solverVariable16 = constraintAnchor24 != null ? constraintAnchor24.f36817i : null;
                    ConstraintAnchor constraintAnchor25 = constraintWidget14.f36840M[i3];
                    ConstraintAnchor constraintAnchor26 = constraintWidget15.f36840M[i36];
                    if (solverVariable15 == null || solverVariable16 == null) {
                        constraintWidget = constraintWidget15;
                        constraintWidget2 = constraintWidget14;
                        i7 = i5;
                        i5 = i7;
                    } else {
                        float f8 = i == 0 ? constraintWidget18.f36855a0 : constraintWidget18.f36857b0;
                        int iM15728d10 = constraintAnchor25.m15728d();
                        constraintWidget = constraintWidget15;
                        constraintWidget2 = constraintWidget14;
                        linearSystem.m15689b(constraintAnchor25.f36817i, solverVariable15, iM15728d10, f8, solverVariable16, constraintAnchor26.f36817i, constraintAnchor26.m15728d(), 7);
                    }
                }
                if ((z || z2) && constraintWidget2 != null && constraintWidget2 != constraintWidget) {
                    ConstraintAnchor[] constraintAnchorArr10 = constraintWidget2.f36840M;
                    ConstraintAnchor constraintAnchor27 = constraintAnchorArr10[i3];
                    int i37 = i3 + 1;
                    ConstraintAnchor constraintAnchor28 = constraintWidget.f36840M[i37];
                    ConstraintAnchor constraintAnchor29 = constraintAnchor27.f36814f;
                    SolverVariable solverVariable17 = constraintAnchor29 != null ? constraintAnchor29.f36817i : null;
                    ConstraintAnchor constraintAnchor30 = constraintAnchor28.f36814f;
                    SolverVariable solverVariable18 = constraintAnchor30 != null ? constraintAnchor30.f36817i : null;
                    if (constraintWidget3 != constraintWidget) {
                        ConstraintAnchor constraintAnchor31 = constraintWidget3.f36840M[i37].f36814f;
                        solverVariable18 = constraintAnchor31 != null ? constraintAnchor31.f36817i : null;
                    }
                    if (constraintWidget2 == constraintWidget) {
                        constraintAnchor27 = constraintAnchorArr10[i3];
                        constraintAnchor28 = constraintAnchorArr10[i37];
                    }
                    if (solverVariable17 != null && solverVariable18 != null) {
                        linearSystem.m15689b(constraintAnchor27.f36817i, solverVariable17, constraintAnchor27.m15728d(), 0.5f, solverVariable18, constraintAnchor28.f36817i, constraintWidget.f36840M[i37].m15728d(), 5);
                    }
                }
            } else {
                i5 = i11;
                i6 = i2;
                chainHeadArr2 = chainHeadArr;
            }
            i11 = i5 + 1;
            i10 = 2;
            constraintWidgetContainer2 = constraintWidgetContainer;
            i2 = i6;
            chainHeadArr = chainHeadArr2;
        }
    }
}
