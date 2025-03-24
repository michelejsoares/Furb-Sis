import matplotlib.pyplot as plt  # type: ignore
from matplotlib_venn import venn3  # type: ignore

# Usando conjuntos (set) em vez de tuplas (tuple)
hardware = {"Microsoft", "Apple", "IBM", "Tesla", "NVIDIA"}
print(f"H = {hardware}")

cloudComputing = {"Google", "Amazon", "Microsoft", "IBM", "Oracle", "NVIDIA", "Meta"}
print(f"C.C = {cloudComputing}")

redesSociais = {"Google", "Meta", "Tiktok"}
print(f"R.S = {redesSociais}")

# Interseção entre hardware e redes sociais
intersecao = hardware.intersection(redesSociais)
print(f"A ∩ S = {intersecao}")
